package com.ap.Algorithm.trees;

import com.ap.Algorithm.trees.util.Node;
import com.ap.Algorithm.trees.util.TreeUtility;

/**
 * Created by APandey1 on 15-10-2017.
 */
public class CheckBST {

    public static boolean checkBSTUtil(Node root, int min, int max) {
        if(root == null)
            return true;
        if(root.data < min || root.data > max)
            return false;

        return checkBSTUtil(root.left, min, root.data-1) && checkBSTUtil(root.right, root.data+1, max);
    }

    public static boolean checkBST(Node root) {
        return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        Node root = TreeUtility.buildDummyBST();
        System.out.println(checkBST(root));
        root = TreeUtility.buildDummyWrongBST();
        System.out.println(checkBST(root));
    }
}
