package com.ammarbahtiarasli;

import java.util.Scanner;

public class KonversiUang {
    public static void main(String[] args) {
        int totalgaji,j50k,s50k,j10k,j1k;

        Scanner sc= new Scanner(System.in);
        System.out.print("Total Gaji : ");totalgaji= sc.nextInt();

        j50k = totalgaji/50000;
        s50k = totalgaji%50000;
        j10k = s50k/10000;
        j1k = s50k%10000/1000;

        System.out.println("Jumlah Lembar 50k = "+j50k);
        System.out.println("Jumlah Lembar 10k = "+j10k);
        System.out.println("Jumlah Lembar 1k = "+j1k);
    }
}
