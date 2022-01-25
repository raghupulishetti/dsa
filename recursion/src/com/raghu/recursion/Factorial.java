package com.raghu.recursion;

public class Factorial {
    
    public static void main(String[] args) {
        System.out.println("Factorial using Iterative: " + factorialIterative(5));
        System.out.println("Factorial using Recursive: " + factorialRec(5));
    }

    static int factorialIterative(int n) {
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static int factorialRec(int n) {
        if (n <= 1)
            return 1;
        return n * factorialRec(n - 1);
    }
}
