// package com.apnacollege;

import java.util.*;

public class Varaibles{

    public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a + b ;
    //     System.out.println(sum);

         Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
//         int n = 4;
         //outer loop 
         for(int i=1; i<=n; i++) {
             //inner loop
             for(int j=1; j<=i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}