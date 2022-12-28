package com.bridgelabz.basic;
import java.util.Scanner;

public class Swap2Number {

            public static void main(String[] args) {
            int swap=0;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter First Number:");
            int num1=sc.nextInt();
            System.out.println("Enter Second Number");
            int num2=sc.nextInt();
            System.out.println("before swaping number is " +num1+" " +num2);
            swap=num1;
            num1=num2;
            num2=swap;
            System.out.println("After swaping the number is " +num1 +" " + num2);

        }

    }

