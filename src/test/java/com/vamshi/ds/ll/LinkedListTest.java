package com.vamshi.ds.ll;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(JUnitPlatform.class)
public class LinkedListTest {

    @Test
    public void toStringTest() {
        LinkedList<String> list = new LinkedList();
        list.addFront("Isabel");
        list.addFront("Ruth");
        list.addFront("Karl");
        list.addFront("John");
        System.out.println(list.findItem("Isabel"));
        System.out.println(list.findItem("Ruth"));
        System.out.println(list.findItem("Karl"));
        System.out.println(list.findItem("John"));
        System.out.println(list.findItem("James"));

        list.deleteFront();
        System.out.println(list.findItem("John"));
        list.addFront("Oliver");
        System.out.println(list.findItem("Ruth"));
        list.addAfter(list.findItem("Ruth").get(), "Sam");
        System.out.println(list.toString());

        LinkedListNode<Integer> x = new LinkedListNode<>(5, null);
    }
}