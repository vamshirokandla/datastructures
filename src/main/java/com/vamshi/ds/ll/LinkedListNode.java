package com.vamshi.ds.ll;

import java.util.Optional;

public class LinkedListNode<V>{
    V value;
    LinkedListNode<V> next;


    public LinkedListNode(V value, LinkedListNode<V> next) {
        this.value = value;
        this.next = next;
    }

    public Optional<LinkedListNode<V>> getNext() {
        return Optional.ofNullable(next);
    }

    public void setNext(LinkedListNode<V> next) {
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
