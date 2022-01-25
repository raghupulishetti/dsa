package com.raghu.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse of a given number using iteration: " + reverseIterative(123));
        System.out.println("Reverse of a given number using recursion: " + reverseRec(506));
    }

    static int reverseRec(int n) {

       return reverse(n, 0);

    }

    static int reverse(int n, int rev){
        if (n < 1) return rev;

        rev = rev*10+(n % 10);

        return reverse(n / 10,rev);

    }

    static int reverseIterative(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = (reverse*10) + (n % 10);
            n = n / 10;
        }
        return reverse;
    }
}
