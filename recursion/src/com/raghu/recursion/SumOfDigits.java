package com.raghu.recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("Sum of digits of given number using iteration: " + sumOfDigitsIterative(123));
        System.out.println("Sum of digits of given number using recursion: " + sumOfDigitsRec(123));
    }

    static int sumOfDigitsRec(int n) {
        if (n <= 0)
            return 0;
        return (n % 10) + sumOfDigitsRec(n / 10);
    }

    static int sumOfDigitsIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
