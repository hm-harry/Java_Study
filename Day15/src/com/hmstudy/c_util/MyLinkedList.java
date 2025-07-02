package com.hmstudy.c_util;

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
    }
}
