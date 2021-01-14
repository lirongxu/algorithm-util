package com.lemon.algorithm.entity;

import lombok.Data;

/**
 * @Author lemon
 * @create 2021/1/14
 */
@Data
public class Node {
    Node next = null;
    Object data;

    public Node(Object data){
        this.data = data;
    }
}
