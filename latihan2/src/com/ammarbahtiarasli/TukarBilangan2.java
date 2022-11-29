package com.ammarbahtiarasli;

import java.util.Scanner;

public class TukarBilangan2 {
    public static void main(String[] args) {
        int A,B;

        Scanner sc= new Scanner(System.in);
        System.out.print("A : ");A= sc.nextInt();
        System.out.print("B : ");B= sc.nextInt();
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("A = "+A);
        System.out.println("B = "+B);
    }
}
