package com.example.proyectos;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms of the Fibonacci series you want to generate: ");
        int cases = scanner.nextInt();

        System.out.println("The Fibonacci series for " + cases + " terms is:");
        for (int i = 0; i < cases; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int cases) {
        if (cases <= 1) {
            return cases;
        } else {
            int a = 0;
            int b = 1;
            int result = 0;
            for (int i = 2; i <= cases; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }
}

