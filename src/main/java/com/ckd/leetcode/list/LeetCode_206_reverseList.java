package com.ckd.leetcode.list;


import com.ckd.list.List;

/**
 * @auther: dck
 * @Date: 2020/2/26
 * @Description:  链表翻转
 * 当前节点指向上一个节点
 */
public class LeetCode_206_reverseList {
    public ListNode reverseList(ListNode head) {
        //当前节点
        ListNode cur = head;
        //前一个节点
        ListNode prev = null;
        while (cur != null){
            //下一个节点
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(-1);
        ListNode head = node;
        for (int i=0;i<10;i++){
            node.next = new ListNode(i);
            node = node.next;
        }
        LeetCode_206_reverseList reverseList = new LeetCode_206_reverseList();
        ListNode node1 = reverseList.reverseList(head);
        System.out.println();
    }
}
