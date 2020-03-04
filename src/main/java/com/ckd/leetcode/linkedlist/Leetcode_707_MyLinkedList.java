package com.ckd.leetcode.linkedlist;

/**
 * @auther: dck
 * @Date: 2020/2/24
 * @Description: 设计一个链表
 */
public class Leetcode_707_MyLinkedList {
    private Node head;
    private int size;
    public Leetcode_707_MyLinkedList() {

    }

    public int get(int index) {
        if (index< 0 || index >=size){
            return -1;
        }
        Node prev = head;
        for (int i=0;i<index;i++){
            prev = prev.next;
        }
        return prev.data;
    }

    public void addAtHead(int val) {
        Node node = new Node(val,head);
        if (head == null){
            head  = node;
        }else {
            head = node;
        }
        size ++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val,null);
        if (head == null){
            head = node;
        }else {
            Node prev = head;
            while (prev.next != null){
                prev = prev.next;
            }
            prev.next = node;
        }
        size ++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size){
            return;
        }

        if (index <=0){
            addAtHead(val);
        }else if (index == size){
            addAtTail(val);
        }else {
            Node prev = head;
            for (int i=0;i<index-1;i++){
                prev = prev.next;
            }
            Node node = new Node(val,prev.next);
            prev.next = node;
            size ++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index <0 || index >=size){
            return;
        }
        if (index == 0){
            removeFirst();
        }else if (index == size-1){
            removeLast();
        }else {
            Node prev = head;
            for (int i=0;i<index-1;i++){
                prev = prev.next;
            }
            prev.next = prev.next.next;
            size --;
        }
    }

    public void removeFirst(){
        if (head == null){
            return;
        }
        head = head.next;
        size --;
    }
    public void removeLast(){
        if (head == null){
            return;
        }
        if (head.next == null){
            head = null;
        }else {
            Node prev= head;
            while (prev.next.next != null){
                prev = prev.next;
            }
            prev.next = null;
        }
        size --;
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
        }

        public Object getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

    }
    @Override
    public String toString() {

        if (head == null){
            return "[]";
        }
        StringBuilder datas = new StringBuilder("[");
        datas.append(head.data).append(",");
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
            datas.append(cur.data).append(",");
        }
        return datas.substring(0,datas.length()-1) + "]";
    }

    public static void main(String[] args) {
        Leetcode_707_MyLinkedList linkedList = new Leetcode_707_MyLinkedList();
        for (int i=0;i<10;i++){
            linkedList.addAtHead(i);
        }
        System.out.println(linkedList);
        for (int i= 20;i<30;i++){
            linkedList.addAtTail(i);
        }
        System.out.println(linkedList);
        linkedList.deleteAtIndex(10);
        linkedList.deleteAtIndex(10);
        linkedList.deleteAtIndex(10);

        System.out.println(linkedList);

    }
}
