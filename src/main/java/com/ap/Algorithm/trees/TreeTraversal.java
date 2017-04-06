package com.ap.Algorithm.trees;

/**
 * Created by APandey on 03-04-2017.
 */
public class TreeTraversal {
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

	// left - root - right
	public void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}

	// root - left - right
	public void preorder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}

	// left - right -root
	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}

	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		Node root = tree.newNode(1);
		root.left = tree.newNode(2);
		root.right = tree.newNode(3);
		root.left.left = tree.newNode(4);
		root.left.right = tree.newNode(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.preorder(root);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.inorder(root);

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.postOrder(root);
	}
}
