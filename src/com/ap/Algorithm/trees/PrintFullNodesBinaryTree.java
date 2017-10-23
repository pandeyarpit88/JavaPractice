package com.ap.Algorithm.trees;

/**
 * Created by APandey on 03-04-2017.
 */
//Print all full nodes in a Binary Tree
// Full Nodes are nodes which has both left and right children as non-empty.
public class PrintFullNodesBinaryTree {
	class Node {
		Node left;
		Node right;
		Integer data;
	}

	Node newNode(Integer data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}

	public void printFullNode(Node node) {
		if(node != null) {
			printFullNode(node.left);
			if (node.left != null && node.right != null)
				System.out.println(node.data);
			printFullNode(node.right);
		}
	}

	public static void main(String[] args) {
		PrintFullNodesBinaryTree nbt = new PrintFullNodesBinaryTree();
		Node root = nbt.newNode(1);
		root.left = nbt.newNode(2);
		root.right = nbt.newNode(3);
		root.left.left = nbt.newNode(4);
		root.right.left = nbt.newNode(5);
		root.right.right = nbt.newNode(6);
		root.right.left.right =nbt.newNode(7);
		root.right.right.right = nbt.newNode(8);
		root.right.left.right.left = nbt.newNode(9);
		nbt.printFullNode(root);
	}
}