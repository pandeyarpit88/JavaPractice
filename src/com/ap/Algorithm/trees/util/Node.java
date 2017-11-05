package com.ap.Algorithm.trees.util;

/**
 * Created by APandey1 on 11-10-2017.
 */
public class Node {
    public Node left, right;
    public int data;
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}