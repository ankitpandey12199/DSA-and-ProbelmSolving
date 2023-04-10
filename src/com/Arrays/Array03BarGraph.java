package com.Arrays;
/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.

5
3 1 0 7 5
			*
			*
			*	*
			*	*
*			*	*
*			*	*
*	*		*	*
 */
import java.util.Scanner;

public class Array03BarGraph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        print(arr);
    }
    public static void print(int arr[])
    {
        int maxHeight=0;
        for (int i = 0; i <arr.length; i++) {
        if(arr[i]>maxHeight)
            maxHeight=arr[i];
        }
       for (int i=maxHeight;i>0;i--)
       {
           for (int a:arr) {
               if(a>=i) System.out.print("*  ");
               else System.out.print("   ");
           }
           System.out.println();
       }
    }
}
