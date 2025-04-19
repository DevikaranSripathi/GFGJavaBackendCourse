package org.example;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int num2 = sc1.nextInt();

        if(num%2==0  ){
            System.out.println(" even :"+num);
       }else if(num%2!=0 ){
            System.out.println("Odd :"+num);
        }
    }

}
