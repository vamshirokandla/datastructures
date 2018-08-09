package com.vamshi.ds.binarytree;

public class BinaryTreeNode<K,V> {

    BinaryTreeNode<K,V> left;
    BinaryTreeNode<K,V> right;
    K key;
    V value;

    public BinaryTreeNode(K key, V value){
        this.key = key;
        this.value = value;
    }

    public BinaryTreeNode<K, V> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<K, V> left) {
        this.left = left;
    }

    public BinaryTreeNode<K, V> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<K, V> right) {
        this.right = right;
    }
}
