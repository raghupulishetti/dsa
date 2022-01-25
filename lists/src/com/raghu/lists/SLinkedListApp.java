package com.raghu.lists;

public class SLinkedListApp {
    public static void main(String[] args) {
       /* SLinkedList linkedList = new SLinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(2);
        linkedList.addFirst(8);
        linkedList.addFirst(4);
        linkedList.addFirst(7);
        linkedList.addFirst(15);
        linkedList.display();
        linkedList.displayHeadTail();


        SLinkedList list = new SLinkedList();
        list.addLast(10);
        list.addLast(2);
        list.addLast(8);
        list.addLast(4);
        list.addLast(7);
        list.addLast(15);
        list.display();
        list.add(50,3);
        list.display();
        list.displayHeadTail();

        list.displayRec(list.head);*/

        SLinkedList list1 = new SLinkedList();
        list1.add(10,0);
        list1.display();
        list1.displayRec(list1.head);
        list1.addFirst(18);
        list1.displayRec(list1.head);
    }
}
