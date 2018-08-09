package com.vamshi.ds.ll;

import java.util.Optional;

public class DbLinkedListNode<V> {

    V value;
    DbLinkedListNode<V> previous;
    DbLinkedListNode<V> next;


    public DbLinkedListNode(V value, DbLinkedListNode<V> next,
                            DbLinkedListNode<V> previous) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public Optional<DbLinkedListNode<V>> getNext() {
        return Optional.ofNullable(next);
    }

    public void setNext(DbLinkedListNode<V> next) {
        this.next = next;
    }

    public DbLinkedListNode<V> getPrevious() {
        return previous;
    }

    public void setPrevious(DbLinkedListNode<V> previous) {
        this.previous = previous;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
