package com.jorgeparavicini.OOPTest;

public class Aufgabe1
{
    /* OUTPUT
    m/r/l: 5/11/0
    m/r/l: 2/4/0
    m/r/l: 3/4/3
    m/r/l: 4/4/4
    Result: -1
     */
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 10, 13, 15, 18, 20, 22, 25, 28, 35};
        int n = arr.length;
        // value to be searched
        int x = 11;
        int result = findCenter(arr, 0, n-1, x);
        System.out.println("Result: " + result);
    }

    private static int findCenter(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int middle = left + (right - left) / 2;
            System.out.println("m/r/l: " + middle + "/" + right + "/" + left);
            if (arr[middle] == x) return middle;
            if (arr[middle] > x) return findCenter(arr, left, middle - 1, x);
            return findCenter(arr, middle + 1, right, x);
        }
        return -1;
    }
}
