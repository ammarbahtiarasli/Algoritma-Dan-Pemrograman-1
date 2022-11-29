package com.ammarbahtiarasli;

import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        String nama;
        double gajipokok, tunjangan, pajak, gajibersih;

        Scanner sc= new Scanner(System.in);
        System.out.print("Nama : ");nama= sc.next();
        System.out.print("Gaji Pokok : ");gajipokok= sc.nextDouble();

        tunjangan = 0.20 * gajipokok;
        pajak =  0.15 + (gajipokok + tunjangan);
        gajibersih = gajipokok + tunjangan - pajak;

        System.out.println("Nama = "+nama);
        System.out.println("Gaji Bersih = "+gajibersih);
    }
}
