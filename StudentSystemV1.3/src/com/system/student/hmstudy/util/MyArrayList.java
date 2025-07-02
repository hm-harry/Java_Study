package com.system.student.hmstudy.util;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * 底层数组, 用来保存数据
     */
    private Object[] elements;

    /**
     * 默认容量为10
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 最大容量为Integer.MAX_VALUE - 8
     */
    private static final int MaxArraySize = Integer.MAX_VALUE - 8;

    /**
     * 当前底层数组中保存的元素个数
     */
    private int size;

    /**
     * 无参构造器, 但是需要提供初始化容器来保存数据
     */
    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 有参构造器, 用来初始化容器大小
     * @param initialCapacity 初始化容器大小, 必须大于0，不能大于Integer.MAX_VALUE - 8
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0 || initialCapacity > MaxArraySize) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }

        elements = new Object[initialCapacity];
    }

    /**
     * 向底层数组中结尾添加元素
     * 
     * @param e 要添加的元素
     * @return true 表示添加成功, false 表示添加失败
     */
    public boolean add(E e) {
        return add(size, e); // 调用add(int index, E e)方法, 传入size, 表示在最后面添加元素, 然后size++
    }


    /**
     * 向底层数组中指定位置添加元素
     * @param index 要添加的位置, 必须大于0, 不能大于size
     * @param e     要添加的元素
     * @return      true 表示添加成功, false 表示添加失败
     */
    public boolean add(int index, E e) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ensureCapacity(size + 1); // 确保底层数组的容量足够, 传入size + 1, 表示需要扩容的最小容量

        for (int i = size; i > index; i--) { // 从最后一个元素开始, 依次将元素向后移动一位, 直到index位置
            elements[i] = elements[i - 1]; // 将元素向后移动一位, 覆盖掉原来的元素, 直到index位置
        }

        elements[index] = e; // 在index位置添加元素
        size++; // 元素个数加1

        return true; // 添加成功, 返回true
    }

    /**
     * 向底层数组中添加另一个MyArrayList对象中的所有元素, 并返回是否添加成功
     * 
     * @param list 要添加的MyArrayList对象，必须是MyArrayList的子类
     * @return     true 表示添加成功, false 表示添加失败
     */
    public boolean addAll(MyArrayList<? extends E> list) { // 向底层数组中添加另一个MyArrayList对象中的所有元素, 并返回是否添加成功
        Object[] array = list.toArray();
        int newSize = array.length;

        ensureCapacity(size + newSize); // 确保底层数组的容量足够, 传入size + newSize, 表示需要扩容的最小容量

        for (int i = 0; i < newSize; i++) { // 从最后一个元素开始, 依次将元素向后移动一位, 直到index位置
            elements[i + size] = array[i]; // 将元素向后移动一位, 覆盖掉原来的元素, 直到index位置
        }

        size += newSize; // 元素个数加1

        return true;
    }

    /**
     * 向底层数组中指定位置添加另一个MyArrayList对象中的所有元素, 并返回是否添加成功
     * @param index 要添加的位置, 必须大于0, 不能大于size
     * @param list  要添加的MyArrayList对象，必须是MyArrayList的子类
     * @return      true 表示添加成功, false 表示添加失败
     */
    public boolean addAll(int index, MyArrayList<? extends E> list) { // 向底层数组中指定位置添加另一个MyArrayList对象中的所有元素, 并返回是否添加成功
        if (index < 0 || index > size) { // 如果index小于0或者大于size, 则抛出异常
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Object[] array = list.toArray();
        int newSize = array.length;

        ensureCapacity(size + newSize); // 确保底层数组的容量足够, 传入size + newSize, 表示需要扩容的最小容量

        for (int i = 0; i < newSize; i++) { // 从最后一个元素开始, 依次将元素向后移动一位, 直到index位置
            elements[index + i + size] = array[i]; // 将元素向后移动一位, 覆盖掉原来的元素, 直到index位置
        }

        for (int i = index; i < index + newSize; i++) {
            elements[i] = array[i - index];
        }

        size += newSize; // 元素个数加1
        return true;
    }

    /**
     * 从底层数组中删除指定元素, 并返回是否删除成功
     * @param obj 要删除的元素
     * @return    true 表示删除成功, false 表示删除失败
     */
    public boolean remove(Object obj) { // 从底层数组中删除指定元素, 并返回是否删除成功
        int index = indexOf(obj); // 从底层数组中查找指定元素的位置, 并返回位置, 如果没有找到, 则返回-1

        if (null == remove(index)) {
            return false;
        }
        return true;
    }

    /**
     * 从底层数组中删除指定位置的元素, 并返回被删除的元素
     * @param index 要删除的位置, 必须大于0, 不能大于size
     * @return      被删除的元素，如果没有元素, 则返回null
     */
    public E remove(int index) { // 从底层数组中删除指定位置的元素, 并返回被删除的元素
        if (index < 0 || index >= size) { // 如果index小于0或者大于等于size, 则抛出异常
            return null; // 没有元素, 则返回null
        }

        E e = get(index);

        for (int i = index; i < size - 1; i++) { // 从index位置开始, 依次将元素向前移动一位, 直到size - 1位置
            elements[i] = elements[i + 1]; // 将元素向前移动一位, 覆盖掉原来的元素, 直到size - 1位置
        }

        elements[size - 1] = null; // 将最后一个元素赋值为null, 帮助垃圾回收器回收
        size--; // 元素个数减1

        return e; // 返回被删除的元素
    }

    /**
     * 取到指定位置的元素, 并返回该元素
     * @param index 要获取的位置, 必须大于0, 不能大于size
     * @return      指定位置的元素
     */
    @SuppressWarnings("unchecked")
    public E get(int index) { // 从底层数组中获取指定位置的元素, 并返回该元素
        if (index < 0 || index >= size) { // 如果index小于0或者大于等于size, 则抛出异常
            throw new ArrayIndexOutOfBoundsException(index);
        }

        return (E) elements[index]; // 返回指定位置的元素
    }

    /**
     * 从底层数组中删除指定位置的元素, 并返回是否删除成功
     * @param obj 要删除的元素
     * @return    返回大于等于0的整数, 表示删除的位置, 如果没有找到, 则返回-1
     */
    public int indexOf(Object obj) { // 从底层数组中查找指定元素的位置, 并返回位置, 如果没有找到, 则返回-1
        int index = -1; // 初始化index为-1, 表示没有找到

        for (int i = 0; i < size; i++) {
            if (obj.equals(elements[i])) { // 如果找到元素, 则将index赋值为i, 并返回
                index = i; // 将index赋值为i, 表示找到元素的位置
                break; // 找到元素, 则跳出循环
            }
        }
        return index;
    }

    /**
     * 从底层数组中倒序查找指定元素的位置, 并返回位置, 如果没有找到, 则返回-1
     * @param obj 要查找的元素
     * @return    返回大于等于0的整数, 表示删除的位置, 如果没有找到, 则返回-1
     */
    public int lastIndexOf(Object obj) { // 从底层数组中查找指定元素的位置, 并返回位置, 如果没有找到, 则返回-1
        int index = -1; // 初始化index为-1, 表示没有找到

        for (int i = size - 1; i >= 0; i--) { // 从最后一个元素开始, 依次向前查找
            if (obj.equals(elements[i])) { // 如果找到元素, 则将index赋值为i, 并返回
                index = i; // 将index赋值为i, 表示找到元素的位置
                break; // 找到元素, 则跳出循环
            }
        }
        return index;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elements, size); // 使用Arrays.copyOf方法, 将底层数组复制到一个新数组中, 并返回新数组;
    }

    /**
     * 判断元素是否存在
     * @param obj 要判断的元素
     * @return     true 表示存在, false 表示不存在
     */
    public boolean contains(Object obj) { // 从底层数组中查找指定元素, 并返回是否包含该元素
        return indexOf(obj) >= 0; // 如果indexOf方法返回的位置大于等于0, 则表示包含该元素, 否则表示不包含该元素
    }

    public boolean contiansAll(MyArrayList<? extends E> list) { // 从底层数组中查找指定元素, 并返回是否包含该元素
        boolean flag = false; // 初始化flag为true, 表示包含该元素
        if (list.size > size || list.isEmpty()) { // 如果list.size大于size, 则表示不包含该元素, 直接返回false
            return flag; // 返回flag的值, 如果flag为true, 则表示包含该元素, 否则表示不包含该元素
        }

        for (int i = 0; i < size - list.size; i++) { // 从底层数组中查找指定元素, 并返回是否包含该元素
            int j = 0;
            for (j = 0; j < list.size; j++) { // 从底层数组中查找指定元素, 并返回是否包含该元素
                if (elements[i] == list.get(j)) {
                    i++;
                } else {
                    break; // 如果找到元素, 则跳出循环
                }
            }
            if (j == list.size) { // 如果list.size大于size, 则表示不包含该元素, 直接返回false
                flag = true; // 返回flag的值, 如果flag为true, 则表示包含该元素, 否则表示不包含该元素
                break;
            }
        }

        return flag;
    }

    public int size() { // 返回底层数组中保存的元素个数
        return size; // 返回size的值, 表示底层数组中保存的元素个数
    }

    /**
     * 判断底层数组是否为空, 并返回是否为空
     * @return true 表示底层数组为空, false 表示底层数组不为空
     */
    public boolean isEmpty() { // 判断底层数组是否为空, 并返回是否为空
        return size == 0; // 如果size等于0, 则表示底层数组为空, 否则表示底层数组不为空
    }

    /**
     * 获取当前集合的子集合
     * @param fromIndex 从指定位置开始, 包括该位置
     * @param endIndex   到指定位置结束, 不包括该位置
     * @return          子集合
     */
    public MyArrayList<E> subList(int fromIndex, int endIndex) { // 从底层数组中获取指定范围的元素, 并返回一个新的MyArrayList对象
        if (fromIndex > endIndex || fromIndex < 0 || endIndex > size) {
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }

        MyArrayList<E> listTemp = new MyArrayList<E>(endIndex - fromIndex); // 创建一个新的MyArrayList对象, 用来保存指定范围的元素 - 底层数组的长度

        for (int i = fromIndex; i < endIndex; i++) { // 从fromIndex位置开始, 依次将元素添加到新的MyArrayList对象中, 直到endIndex位置
            listTemp.add(this.get(i)); // 将元素添加到新的MyArrayList对象中
        }

        return listTemp; // 返回新的MyArrayList对象
    }

    /**
     * 从底层数组中删除指定位置的元素, 并返回是否删除成功
     * @param index 要删除的位置, 必须大于0, 不能大于size
     * @return      指定位置的元素
     */
    public E set(int index, E e) { // 从底层数组中获取指定位置的元素, 并返回该元素
        if (index < 0 || index >= size) { // 如果index小于0或者大于等于size, 则抛出异常
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E temp = get(index);
        elements[index] = e;
        return temp;
    }

    @Override
    public String toString() { // 重写toString方法, 用来将底层数组中的元素转换为字符串, 并返回字符串
        String str = "["; // 初始化字符串为"["
        for (int i = 0; i < size - 1; i++) { // 从第一个元素开始, 依次将元素转换为字符串, 并添加到StringBuilder对象中, 直到最后一个元素
            str += elements[i] + ", "; // 将元素转换为字符串, 并添加到StringBuilder对象中, 直到最后一个元素
        }

        return str + elements[size - 1] + "]"; // 返回字符串, 并在字符串的末尾添加"]"
    }

    /**
     * 每次添加元素时, 如果底层数组容量不足, 则需要扩容
     * 不满足需要指定grow方法
     * @param mincapacity 需要扩容的最小容量
     */
    private void ensureCapacity(int mincapacity) {
        if (mincapacity > elements.length) { // 如果mincapacity大于底层数组的长度, 则需要扩容
            grow(mincapacity); // 调用grow方法, 传入mincapacity, 表示需要扩容的最小容量
        }
    }

    /**
     * 扩容方法, 每次扩容为原来的1.5倍
     * @param mincapacity   需要扩容的最小容量
     */
    private void grow(int mincapacity) {
        int oldCapacity = elements.length; // 获取底层数组的长度

        int newCapacity = oldCapacity + (oldCapacity >> 1); // 新容量为旧容量的1.5倍, 即oldCapacity + oldCapacity / 2

        if (newCapacity < mincapacity) { // 如果新容量小于需要扩容的最小容量, 则新容量为需要扩容的最小容量
            newCapacity = mincapacity;
        }
        
        if (newCapacity > MaxArraySize) { // 如果新容量大于最大容量, 则新容量为最大容量
            if (mincapacity < MaxArraySize) { // 如果需要扩容的最小容量小于最大容量, 则新容量为最大容量
                newCapacity = MaxArraySize;
            } else { // 如果需要扩容的最小容量大于最大容量, 则抛出异常
                throw new OutOfMemoryError(
                    "Overflow MaxArraySize"
                );
            }
        }

        elements = Arrays.copyOf(elements, newCapacity); // 使用Arrays.copyOf方法, 将底层数组扩容到新容量
    }

}
