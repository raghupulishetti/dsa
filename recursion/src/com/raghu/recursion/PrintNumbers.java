package com.raghu.recursion;

/*
This class is to print numbers from n->1 and 1->n using recursion.
 */
public class PrintNumbers {

    public static void main(String[] args) {
        printNToOne(5);
        printOneToN(5);
    }

    /**
     * This method is to print numbers from n to 1 using recursion.
     *
     * @param n
     */
    public static void printNToOne(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNToOne(n - 1);
    }


    /**
     * This method is to print numbers from 1 to n using recursion.
     *
     * @param n
     */
    public static void printOneToN(int n) {
        if (n < 1)
            return;
        printOneToN(n - 1);
        System.out.println(n);
    }


}
