package com.raghu.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 11, 13, 17, 21, 28, 54};
        int index = binarySearchIterative(arr, 2);
        System.out.println("Binary Search Iterative: " + index);

        int i = binarySearchRecursive(arr, 13);
        System.out.println("Binary Search Recursive: " + i);

    }

    private static int binarySearchRecursive(int[] arr, int target) {

        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int low, int high) {

        if (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid])
                return mid;
            else if (target < arr[mid])
                return binarySearch(arr, target, low, mid - 1);
            else
                return binarySearch(arr, target, mid + 1, high);
        }
        return -1;
    }

    private static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid])
                return mid;
            else if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

}
