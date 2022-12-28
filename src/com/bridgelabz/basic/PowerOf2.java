package com.bridgelabz.basic;
import java.util.Scanner;

public class PowerOf2 {

            public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The number");
            int n=sc.nextInt();
            while(n<=31) {
                for(int i=1;i<=n;i++)
                {
                    System.out.println("Power Of 2 is "+ i + "=" +2*i);
                }
                n++;

            }

        }

    }

