package com.raghu.recursion;

public class CountOfZerosInNumber {
    public static void main(String[] args) {
        System.out.println("Iterative-> "+zeroCountIterative(1020803409));
        System.out.println("Recursive-> "+zeroCountRecursive(1020803409));
    }

    static int zeroCountRecursive(int n) {
        return count(n, 0);
    }

    private static int count(int n, int count){
        if(n<=0)
            return count;
        if(n%10==0) count++;
        return count(n/10,count);

    }

    static int zeroCountIterative(int n) {

        int count = 0;
        while(n!=0){
            count = n%10==0?++count:count;
            n = n/10;
        }
        return count;
    }
}
