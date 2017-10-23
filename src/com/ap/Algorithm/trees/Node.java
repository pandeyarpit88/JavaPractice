package com.ap.Algorithm.trees;

/**
 * Created by APandey1 on 11-10-2017.
 */
class Node {
    public Node left, right;
    int data;
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}