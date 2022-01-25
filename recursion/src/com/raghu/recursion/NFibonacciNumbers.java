package com.raghu.recursion;

public class NFibonacciNumbers {

    public static void main(String[] args) {
        System.out.println("NFibonacci numbers using iterative: ");
        printNNumbersIterative(8);
        System.out.println();
        System.out.println("NFibonacci numbers using Recursive: ");
        printNNumbersRecursive(8);
    }

    static void printNNumbersIterative(int n) {
        int first = 0;
        int second = 1;
        int temp;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i <= n; i++) {
            temp = first + second;
            System.out.print(temp + " ");
            first = second;
            second = temp;

        }
    }


    static void printNNumbersRecursive(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(findNthFibonacciNumberRecursive(i) + " ");
        }

    }

    /**
     * This method is used to print nth fibonacci number using recursion.
     *
     * @param n
     * @return
     */
    static int findNthFibonacciNumberRecursive(int n) {
        if (n <= 1) return n;
        return findNthFibonacciNumberRecursive(n - 1) + findNthFibonacciNumberRecursive(n - 2);
    }
}
