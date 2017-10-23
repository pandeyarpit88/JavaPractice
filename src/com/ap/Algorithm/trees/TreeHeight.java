package com.ap.Algorithm.trees;

/**
 * Created by APandey1 on 15-10-2017.
 */
public class TreeHeight {
    public static int getTreeHeight(Node root) {
        if(root == null)
            return 0;

        int ltreeHeight = getTreeHeight(root.left);
        int rtreeHeight = getTreeHeight(root.right);
        if (ltreeHeight > rtreeHeight)
            return ltreeHeight+1;
        return rtreeHeight+1;
    }

    public static void main(String[] args) {
        Node node = TreeUtility.buildDummyTree();
        int h = getTreeHeight(node);
        System.out.println(h);
    }
}
