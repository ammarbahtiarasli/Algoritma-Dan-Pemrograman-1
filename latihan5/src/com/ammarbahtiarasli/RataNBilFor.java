package com.ammarbahtiarasli;

import java.util.Scanner;

public class RataNBilFor {
    public static void main(String[] args) {
        // menghitung nilai rata rata
        int i;
        float rata, jumlah = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("N : ");int n=input.nextInt();
        for ( i = 1; i <= n; i++) {
            jumlah=jumlah+i;
        }
        System.out.println("jumlah= "+jumlah);

        if (n > 0) {
        rata = jumlah/n;
        System.out.println("rata rata= "+rata);
        }else {
            System.out.println("nilai rata rata tidak terhingga");
        }
    }
}
