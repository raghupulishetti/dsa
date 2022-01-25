package com.raghu.recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println("Product of digits of given number using iteration: " + productOfDigitsIterative(1234));
        System.out.println("Product of digits of given number using recursion: " + productOfDigitsRec(1234));
    }

    static int productOfDigitsRec(int n) {
        if (n < 1)
            return 1;

        return (n % 10) * productOfDigitsRec(n / 10);
    }

    static int productOfDigitsIterative(int n) {
        int product = 1;
        while (n > 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }
}
