package com.ap.Algorithm.linkList;

/**
 * Created by APandey on 03-04-2017.
 */
public class CircularLinkList {
	/*Insertion
	-> Insertion in an empty list
	-> Insertion at the beginning of the list
	-> Insertion at the end of the list
	-> Insertion in between the nodes
	 */

	class Node {
		Node next;
		Integer data;
	}

	public Node newNode(Integer data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		return n;
	}



	public Node addToEmpty() {
		Node n = new Node();
		return n;
	}

	public Node addToLast() {
		Node n = new Node();
		return n;
	}
}
