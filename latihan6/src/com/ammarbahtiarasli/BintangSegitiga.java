package com.ammarbahtiarasli;

import java.util.Scanner;

public class BintangSegitiga {
    public static void main(String[] args) {
        int i, jumlah, nomor;
        System.out.println("Masukan nilai N : ");
        Scanner inputan = new Scanner(System.in);
        nomor = inputan.nextInt();

        for (i=1; i<=nomor; i++) {
            for (jumlah=1; jumlah<=i; jumlah++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
