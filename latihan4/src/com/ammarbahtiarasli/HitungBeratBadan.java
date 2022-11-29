package com.ammarbahtiarasli;

import java.util.Scanner;
public class HitungBeratBadan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat, tinggi;
        float bmi, konfersi_tinggi;

        System.out.print("Masukan Berat: ");
        berat = input.nextInt();
        System.out.print("Masukan Tinggi: ");
        tinggi = input.nextInt();

        konfersi_tinggi = tinggi / 100;
        bmi = (float) (berat / Math.pow(konfersi_tinggi, 2));
        if (bmi <= 18.5) {
            System.out.println("berat : " + berat + "kg, " + "tinggi : " + tinggi +
                    "cm, anda kurus");
        } else if (bmi <= 22.9) {
            System.out.println("berat : " + berat + "kg, " + "tinggi : " + tinggi +
                    "cm, anda normal");
        } else if (bmi < 24.9) {
            System.out.println("berat : " + berat + "kg, " + "tinggi : " + tinggi +
                    "cm, anda overweight");
        } else {
            System.out.println("berat : " + berat + "kg, " + "tinggi : " + tinggi +
                    "cm, anda obesitas");
        }
    }
}
