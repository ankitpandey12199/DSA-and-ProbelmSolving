package com.Arrays;

import java.util.Scanner;

/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.
5
3 1 0 7 5
6
1 1 1 1 1 1
1 4 2 1 8 6
 */
public class Arrray05SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] ans = sum(arr1, arr2);
        for (int a : ans) System.out.print(a + " ");
    }

    public static int[] sum(int[] arr1, int[] arr2) {
        int n = Math.max(arr1.length, arr2.length);
        int[] ans = new int[n];
        int index = n - 1;
        int a = arr1.length - 1, b = arr2.length - 1;
        int carry = 0;
        while (a >= 0 && b >= 0) {
            int sum = carry + arr1[a] + arr2[b];
            ans[index--] = sum % 10;
            carry = sum / 10;
            a--;
            b--;
        }
        while (a >= 0) {
            int sum = carry + arr1[a];
            ans[index--] = sum % 10;
            carry = sum / 10;
            a--;
        }
        while (b >= 0) {
            int sum = carry + arr2[b];
            ans[index--] = sum % 10;
            carry = sum / 10;
            b--;
        }
        if (carry == 0) return ans;
        int[] finalAns = new int[n + 1];
        finalAns[0] = carry;
        for (int i = 0; i < n; i++) {
            finalAns[i + 1] = ans[i];
        }
        return finalAns;
    }
}
