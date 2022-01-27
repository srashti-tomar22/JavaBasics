package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        factorial(n);
    }


    public static void factorial(int n) {
       int fact= 1;
       int i = 1;
       while (i <= n){
           fact = fact*i;
           i++;
       }
        System.out.println(fact);

    }
//    Write a  program to find HCF (GCD) of two numbers.
     int a = 20;
    int b = 28;
//    20->2*2*5
//    28-> 2*2*7







}


