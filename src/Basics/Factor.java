package Basics;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        factor(n);
        primeFactor(n);
    }

    //print factors
    public static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void primeFactor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (PrimeNumber.isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}

