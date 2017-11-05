package com.ap.Algorithm.trees;

import com.ap.Algorithm.trees.util.Node;
import com.ap.Algorithm.trees.util.TreeUtility;

/**
 * Created by APandey1 on 11-10-2017.
 */

public class MirrorTree {

    Node mirror(Node root) {
        if(root == null)
            return root;

        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;

        return root;
    }

    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }


    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();
        Node node = TreeUtility.buildDummyTree();
        Node n = tree.mirror(node);
        System.out.println("----------Original Tree-----------");
        tree.inorder(node);
        System.out.println("----------Mirror Tree-----------");
        tree.inorder(n);
    }
}
