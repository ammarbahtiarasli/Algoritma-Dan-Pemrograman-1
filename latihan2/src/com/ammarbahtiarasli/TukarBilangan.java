package com.ammarbahtiarasli;

import java.util.Scanner;

public class TukarBilangan {
    public static void main(String[] args) {
        int A,B,C;

        Scanner sc= new Scanner(System.in);
        System.out.print("A : ");A= sc.nextInt();
        System.out.print("B : ");B= sc.nextInt();
        C = A; //simpan nilai A di tempat penampungan sementara
        A = B; //sekarang A dapat diisi dengan nilai B
        B = C; //isi B dengan nilai A semula yang tadi disimpan di C

        System.out.println("A = "+A);
        System.out.println("B = "+B);
    }
}
