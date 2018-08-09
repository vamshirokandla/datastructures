package com.vamshi.ds.ll;

import java.util.Optional;

public class LinkedList<V> {

    private LinkedListNode<V> head;

    public LinkedList(){
        head = null;
    }

    public void addFront(V item){
        this.head = new LinkedListNode<>(item,head);
    }

    public void deleteFront() {
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n->n.setNext(null));
    }

    public Optional<LinkedListNode<V>> findItem(V item){

        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);

        while(node.filter(n->n.getValue() != item).isPresent()){

            node = node.flatMap(LinkedListNode::getNext);
        }

        return node;
    }

    public void addAfter(LinkedListNode<V> aNode, V item){
        aNode.setNext(new LinkedListNode<>(item,aNode.getNext().orElse(null)));
    }


    public String toString(){
        StringBuilder result = new StringBuilder("[");

        Optional<LinkedListNode<V>> aNode = Optional.ofNullable(this.head);

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




