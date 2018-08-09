package com.vamshi.ds.queue;

import com.vamshi.ds.ll.DbLinkedListNode;
import com.vamshi.ds.ll.LinkedListNode;

import java.util.Optional;

public class Queue<V> {

    DbLinkedListNode<V> head;
    DbLinkedListNode<V> tail;

    public Queue(){
        this.head = null;
        this.tail = null;
    }

    public void enQueue(V item){
        DbLinkedListNode<V> node = new DbLinkedListNode<>(item,null,tail);
        Optional.ofNullable(tail).ifPresent(n->n.setNext(node));
        tail = node;

        if(head == null)
            head = node;
    }

    public Optional<V> deQueue(){

        Optional<DbLinkedListNode<V>> node = Optional.ofNullable(head);
        head = node.flatMap(DbLinkedListNode::getNext).orElse(null);
        Optional.ofNullable(head).ifPresent(n->n.setPrevious(null));
        if(head == null)tail = null;

        return node.map(DbLinkedListNode::getValue);
    }

    public String toString(){
        StringBuilder result = new StringBuilder("[");

        Optional<DbLinkedListNode<V>> aNode = Optional.ofNullable(this.head);

        while(aNode.isPresent()){

            result.append(aNode.get().getValue());
            aNode = aNode.flatMap(n->n.getNext());

            if(aNode.isPresent())
                result.append(",");
        }

        result.append( "]");

        return result.toString();
    }

}
