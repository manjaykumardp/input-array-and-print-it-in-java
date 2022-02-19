package com.manjay;

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        System.out.println("Enter numbers of element");
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");

        }
    }
}
