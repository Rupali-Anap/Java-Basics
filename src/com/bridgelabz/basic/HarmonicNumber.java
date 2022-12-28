package com.bridgelabz.basic;
import java.util.Scanner;

public class HarmonicNumber {

            public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int number=sc.nextInt();
            double Harmonic=0;
            if(number!=0){
                for(int i=1;i<=number;i++) {
                    System.out.print("1/" + i + " "  );
                    Harmonic+=1/(double)i;
                }

            }
            else {
                System.out.println("limit should be more than 0");
            }
            System.out.println("=" + Harmonic);

        }

    }

