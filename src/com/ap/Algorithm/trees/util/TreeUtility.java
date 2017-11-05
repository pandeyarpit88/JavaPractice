package com.ap.Algorithm.trees.util;

/**
 * Created by APandey1 on 11-10-2017.
 */
public class TreeUtility {
    public static Node buildDummyTree() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        return node;
    }

    public static Node buildDummyBST() {
        Node node = new Node(10);
        node.left = new Node(5);
        node.right = new Node(15);
        node.left.left = new Node(3);
        node.left.right = new Node(7);
        node.right.left = new Node(12);
        node.right.right = new Node(17);
        return node;
    }

    public static Node buildDummyWrongBST() {
        Node node = new Node(10);
        node.left = new Node(5);
        node.right = new Node(15);
        node.left.left = new Node(3);
        node.left.right = new Node(11);
        node.right.left = new Node(12);
        node.right.right = new Node(17);
        return node;
    }
}
