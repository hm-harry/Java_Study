package com.hmstudy.c_util;

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
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 有参构造器, 用来初始化容器大小
     * @param initialCapacity 初始化容器大小, 必须大于0，不能大于Integer.MAX_VALUE - 8
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0 || initialCapacity > MaxArraySize) {
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


    public boolean add(int index, E e) {
        return true;
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
    }

}
