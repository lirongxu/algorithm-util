package com.lemon.algorithm.util;

import com.lemon.algorithm.entity.Node;

/**
 * @Author lemon
 * @create 2021/1/15
 */
public class SingleLinkedList<T> {

    public int length = 0;

    public Node headNode;

    private Node tailNode;

    /**
     * 添加数据节点
     * @param data
     */
    public void add(T data) {
        if(data == null) {
            return;
        }
        Node node = new Node<T>(data);
        length ++;
        if(headNode == null) {
            headNode = node;
            return;
        }
        Node temp = headNode;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    public void delete(int index) {
        int pre = 0;
        Node temp = headNode;
        while(temp.getNext() != null) {
            if(index == pre) {
                temp.setNext(temp.getNext().getNext());
                length --;
                return;
            }
            pre ++;
            temp = temp.getNext();
        }
    }

    /**
     * 添加数据节点 优化方式
     * @param data
     */
    public void push(T data) {
        if(data == null) {
            return;
        }
        Node node = new Node<T>(data);
        length ++;
        if(headNode == null) {
            headNode = node;
            return;
        }
        if(tailNode == null) {
            tailNode = node;
            headNode.setNext(tailNode);
            return;
        }
        tailNode.setNext(node);
        tailNode = node;
    }

}
