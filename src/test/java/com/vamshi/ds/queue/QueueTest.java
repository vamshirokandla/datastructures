package com.vamshi.ds.queue;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(JUnitPlatform.class)
public class QueueTest {

    @Test
    void enQueue() {

        Queue<String> q = new Queue<>();
        q.enQueue("one");
        q.enQueue("two");
        q.enQueue("three");

        System.out.println("Queue:"+q.toString());
    }

    @Test
    void deQueue() {

        Queue<String> q = new Queue<>();
        q.enQueue("one");
        q.enQueue("two");
        q.enQueue("three");

        System.out.println("Queue:"+q.toString());

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

        q.enQueue("one");
        System.out.println("Queue:"+q.toString());


        System.out.println(q.deQueue());
        System.out.println(q.deQueue());


    }
}