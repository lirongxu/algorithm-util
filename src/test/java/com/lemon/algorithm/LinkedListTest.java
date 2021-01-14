package com.lemon.algorithm;

import com.lemon.algorithm.entity.Node;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @Author lemon
 * @create 2021/1/14
 */
@Slf4j
@SpringBootTest
public class LinkedListTest {

    Node head = null;

    @Test
    public void test() {
        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.addNode("test1");
        linkedListTest.addNode("test2");
        linkedListTest.addNode("test3");
        log.info("link length:{}", linkedListTest.length());

        Node temp = linkedListTest.head;
        while (temp != null) {
            log.info("link node data:{}", temp.getData());
            temp = temp.getNext();
        }

    }

    public void addNode(Object data) {

        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    public int length() {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            length ++;
            temp = temp.getNext();
        }
        return length;
    }
}