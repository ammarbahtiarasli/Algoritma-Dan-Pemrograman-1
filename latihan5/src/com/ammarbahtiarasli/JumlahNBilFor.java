package com.ammarbahtiarasli;
import java.util.Scanner;

public class JumlahNBilFor {
    public static void main(String[] args) {
    // menjumlahkan deret
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("N : ");int n=input.nextInt();
        int jumlah = 0;
        for ( i = 1; i <= n; i++) {
            jumlah=jumlah+i;
        }
        System.out.println("jumlah= "+jumlah);
    }
}
