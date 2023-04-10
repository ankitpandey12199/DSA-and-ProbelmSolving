package com.Arrays;
/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as
   difference of maximum value and minimum value.

6
15 30 40 4 11 9
 */

import java.util.Scanner;

public class Array02Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        System.out.println(Math.abs(min - max));
    }

}
