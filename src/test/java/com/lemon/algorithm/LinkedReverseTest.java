package com.lemon.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author lemon
 * @Date 2021/4/13
 */
@Slf4j
@SpringBootTest
public class LinkedReverseTest {

    @Test
    public void reverseLinkedTest() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        log.info("反转前:{}", head.toString());

        Node afterNode = reverseLinked(head);
        log.info("反转后:{}", afterNode.toString());
    }

    /**
     * 反转链表
     * 1->2->3->4->5->6 ==> 6->5->4->3->2->1
     * 1、如果头结点为空或者头结点next为空返回头结点
     * 2、
     * @param head
     * @return
     */
    private Node reverseLinked(Node head) {
        if(head == null && head.next == null) {
            return head;
        }
        Node pre = head;
        Node cur = head.next;
        while (cur.next != null) {
            Node tmp = cur.next;


            cur = tmp;
        }

        Node node = reverseLinked(head.next);
        head.next = node;
        head.next = null;
        return node;
    }
}

/**
 * 链表元素对象
 */
class Node {
    /**
     * 链表下一个元素
     */
    Node next;
    /**
     * int类型数据
     */
    int data;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        Node curNode = this;
        stringBuffer.append(curNode.data);
        while (curNode.next != null) {
            stringBuffer.append("->");
            stringBuffer.append(curNode.next.data);
            curNode = curNode.next;
        }
        return stringBuffer.toString();
    }
}
