package com.raghu.lists;

public class SLinkedList {

    private int size;
    public ListNode head;
    public ListNode tail;

    SLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int value) {
        ListNode node = new ListNode(value, null);
        if (head == null)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int value) {
        ListNode node = new ListNode(value, null);
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;

    }

    public ListNode add(int value, int index) {
        if (index > size)
            throw new IllegalArgumentException("Index should be less than the size " + size);
        ListNode node = new ListNode(value, null);

        if (head == null)
            head = tail = node;
        else {
            ListNode temp = head;
            while (index > 1 && temp.next != null) {
                temp = temp.next;
                index--;
            }
            node.next = temp.next;
            temp.next = node;
        }
        return node;

    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void displayRec(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " -> ");
        if(head.next==null)
            System.out.println("END");
        displayRec(head.next);
    }

    public void displayHeadTail() {
        System.out.println("Head ->" + head.value);
        System.out.println("Tail ->" + tail.value);
    }

    class ListNode {
        int value;
        ListNode next;

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
