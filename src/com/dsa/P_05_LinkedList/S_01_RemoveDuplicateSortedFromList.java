package com.dsa.P_05_LinkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> data = new HashSet<>();

        ListNode prev = head;
        ListNode cur = head;

        System.out.println(cur);
        while (cur.next != null) {
            if (data.contains(cur.val)) {
                prev.next = cur.next;
                cur = cur.next;
            }
            data.add(cur.val);
            prev = cur;
            cur = cur.next;
        }
        if (prev.val == cur.val) prev.next = null;
        return head;
    }
}

public class S_01_RemoveDuplicateSortedFromList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
                head.next = new ListNode(1);
                head.next.next= new ListNode(2);
                head.next.next.next= new ListNode(3);
                head.next.next.next.next = new ListNode(3);

        head = new Solution().deleteDuplicates(head);
        while (head != null){
            System.out.print(head.val +" ");
            head = head.next;
        }
    }
}
