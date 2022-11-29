package com.ammarbahtiarasli;

import java.util.Scanner;

public class KomisiPenjualan {
    public static void main(String[] args) {
        String nama;
        double Penjualan, Komisi;

        Scanner sc= new Scanner(System.in);
        System.out.print("Nama : ");nama=sc.next();
        System.out.print("Penjualan : ");Penjualan=sc.nextFloat();
        Komisi = 0.05 * Penjualan;

        System.out.println("nama = "+nama);
        System.out.println("komisi = "+Komisi);
    }
}
