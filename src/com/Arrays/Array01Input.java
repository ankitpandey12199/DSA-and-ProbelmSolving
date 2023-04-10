package com.Arrays;

import java.util.Scanner;
/*
This is a code that inputs and array and prints it
 */
public class Array01Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Here is the entered array elements");
        for (int a:arr)
        {
            System.out.print(a+" ");
        }
        System.out.println();

    }
}
