package com.ap.Algorithm.linkList.LinkedListUtil;

/**
 * Created by APandey1 on 01-11-2017.
 */
public class LinkedListUtil {
    public static void printList(Node head) {
        if (head != null) {
            System.out.println(head.data);
            printList(head.next);
        }
    }

    int getsize(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
