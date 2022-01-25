package com.raghu.recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Nth Fibonacci number using Iteration-> " + findNthFibonacciNumberIterative(8));
        System.out.println("Nth Fibonacci number using Recursion-> " + findNthFibonacciNumberRecursive(8));

    }

    /**
     * This method is used to print nth fibonacci number using Iteration.
     *
     * @param n
     * @return
     */
    public static int findNthFibonacciNumberIterative(int n) {
        int first = 0;
        int second = 1;
        int temp = 0;
        if (n <= 1) return n;
        for (int i = 2; i <= n; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    /**
     * This method is used to print nth fibonacci number using recursion.
     *
     * @param n
     * @return
     */
    public static int findNthFibonacciNumberRecursive(int n) {
        if (n <= 1)
            return n;

        return findNthFibonacciNumberRecursive(n - 1) + findNthFibonacciNumberRecursive(n - 2);
    }
}
