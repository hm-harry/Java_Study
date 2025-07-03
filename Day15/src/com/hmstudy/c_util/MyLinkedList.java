package com.hmstudy.c_util;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private int size = 0;
    // 头节点
    private Node<E> first;
    // 尾节点
    private Node<E> last;

    /**
     * 私有化静态成员内部类
     * 
     */
    private static class Node<E> {
        // 在LinkedList中保存的Node节点元素
        E item;
        // 下一个节点的地址
        Node<E> next;
        // 上一个节点的地址
        Node<E> prev;

        /**
         * 构造方法
         * @param prev 上一个节点的地址
         * @param element   当前节点保存的元素
         * @param next       下一个节点的地址
         */
        public Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList() {

    }

    /**
     * 向链表中添加元素
     * 
     * @param e 要添加的元素
     * @return 添加成功返回true，失败返回false
     */
    public boolean add(E e) {
        Node<E> l = last;

        Node<E> newNode = new Node<>(l, e, null);

        last = newNode;

        if (first == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }

        size++;

        return true;
    }

    /**
     * 同是尾插法操作
     * @param e 要添加的元素
     */
    public void addLast(E e) {
        add(e);
    }

    /**
     * 向链表头部添加元素
     * @param e 要添加的元素
     */
    public void addFirst(E e) {
        Node<E> f = first;

        Node<E> newNode = new Node<>(null, e, f);

        first = newNode;

        if(null == f) {
            last = newNode;
        } else {
            f.prev = newNode;
        }

        size++;
    }

    /**
     * 获取第一个元素
     * @return 第一个元素
     */
    public E getFirst() {
        if(null == first) {
            throw new NoSuchElementException();
        }
        return first.item;
    }

    /**
     * 获取最后一个元素
     * @return 最后一个元素
     */
    public E getLast() {
        if(null == last) {
            throw new NoSuchElementException();
        }
        return last.item;
    }

    /**
     * 获取指定下标的元素
     * @param index 下标
     * @return 指定下标的元素
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index < (size >> 1)) {
            Node<E> n = first;
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
            return n.item;
        } else {
            Node<E> n = last;
            for (int i = size - 1; i > index; i--) {
                n = n.prev;
            }
            return n.item;
        }
    }

    public E removeLast() {
        Node<E> l = last;

        if (null == l) {
            throw new NoSuchElementException();
        }

        Node<E> prev = l.prev;

        if (null == prev) {
            first.prev = null;
            E e = first.item;
            first.item = null;
            return e;
        }

        l.prev = null;
        E e = l.item;
        l.item = null;

        last = prev;
        last.next = null;

        size--;

        return e;
    }
}
