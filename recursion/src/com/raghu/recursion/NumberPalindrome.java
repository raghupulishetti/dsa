package com.raghu.recursion;

public class NumberPalindrome {


    public static void main(String[] args) {
        System.out.println(palindrome(123));
    }

    static boolean palindrome(int n){
        return n==reverseRec(n);
    }
    static int reverseRec(int n) {

        return reverse(n, 0);

    }

    static int reverse(int n, int rev){
        if (n < 1) return rev;

        rev = rev*10+(n % 10);

        return reverse(n / 10,rev);

    }
}
