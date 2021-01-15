package com.lemon.algorithm;

import com.lemon.algorithm.entity.Node;
import com.lemon.algorithm.util.SingleLinkedList;
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

        SingleLinkedList singleLinkedList = new SingleLinkedList<String>();
        singleLinkedList.push("test1");
        singleLinkedList.push("test2");
        singleLinkedList.push("test3");
        singleLinkedList.push("test4");
        singleLinkedList.push("test5");
        log.info("link length:{}", singleLinkedList.length);

        singleLinkedList.delete(1);
        log.info("link length:{}", singleLinkedList.length);
        Node temp = singleLinkedList.headNode;
        while (temp != null) {
            log.info("link node data:{}", temp.getData());
            temp = temp.getNext();
        }

    }
}