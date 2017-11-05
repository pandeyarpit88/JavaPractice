package com.ap.Algorithm.linkList;

import com.ap.Algorithm.linkList.LinkedListUtil.BuildLinkList;
import com.ap.Algorithm.linkList.LinkedListUtil.LinkedListUtil;
import com.ap.Algorithm.linkList.LinkedListUtil.Node;

/**
 * Created by APandey on 08-04-2017.
 */
public class ReverseSinglyLinkList {

	static Node head;
	public static Node reverseList(Node curr, Node prev) {
		//last node then mark head
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return null;
		}

		Node next = curr.next;
		curr.next = prev;
		reverseList(next, curr);
		return head;
	}
	public static void main(String[] args) {
		Node head = BuildLinkList.getRandomList(10);
		System.out.println("-----------Original List-------------");
		LinkedListUtil.printList(head);
		System.out.println("-----------Reverse List-------------");
		head = reverseList(head, null);
		LinkedListUtil.printList(head);
	}
}
