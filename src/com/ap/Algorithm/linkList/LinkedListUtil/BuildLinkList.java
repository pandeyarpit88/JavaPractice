package com.ap.Algorithm.linkList.LinkedListUtil;

import java.util.Map;

/**
 * Created by APandey1 on 01-11-2017.
 */
public class BuildLinkList {

    public static Node getRandomNode(int size) {
        int num = (int) (Math.random()*1000 % (size + 200));
        return new Node(num);
    }
    public static Node getRandomList(int size) {
        Node head = getRandomNode(size);
        Node current = head;
        while (size>0){
            current.next = getRandomNode(size);
            current = current.next;
            size--;
        }
        return head;
    }
}
