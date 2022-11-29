package com.ammarbahtiarasli;

import java.util.Scanner;

public class TransaksiKeuangan {

    public static void main(String[] args){
        int kode_transaksi;
        float saldo, nominal;
        saldo =50000;
        //float nominal;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("masukan kode transaksi (tekan 0 untuk menyetor uang / tekan 1 untuk mengambil uang dan tekan 2 untuk exit) : ");
            kode_transaksi = input.nextInt();
            if (kode_transaksi == 0) {
                System.out.println("masukan nominal : ");
                nominal = input.nextFloat();
                saldo = saldo+nominal;
                System.out.println("Sisa saldo anda : "+saldo);
            }
            else if(kode_transaksi == 1){
                System.out.println("masukan nominal : ");
                nominal = input.nextFloat();
                if(saldo - nominal < 10000){
                    System.out.println("saldo tidak mencukupi");
                }
                else{
                    saldo = saldo-nominal;
                    System.out.println("Sisa saldo anda : "+saldo);
                }
            }
            else if(kode_transaksi ==2){
                System.out.println("terimakasih");
                break;
            }
        }
        while(true);
    }
}