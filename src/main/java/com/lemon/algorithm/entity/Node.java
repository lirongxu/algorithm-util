package com.lemon.algorithm.entity;

import lombok.Data;

/**
 * @Author lemon
 * @create 2021/1/14
 */
@Data
public class Node<T> {
    Node next = null;
    Node pre = null;
    T data;

    public Node(T data){
        this.data = data;
    }
}
