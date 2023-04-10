package com.Arrays;

import java.util.Scanner;

/*
1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based).
If found print the index, otherwise print -1.
 */
public class Array03IsPresent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        System.out.println(search(arr,d));
    }
    public  static int search(int arr[],int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)return i;
        }
        return -1;
    }
}
