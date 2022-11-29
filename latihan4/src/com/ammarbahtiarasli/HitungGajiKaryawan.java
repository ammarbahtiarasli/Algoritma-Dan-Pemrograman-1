package com.ammarbahtiarasli;

import java.util.Scanner;
public class HitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int golongan,gaji_pokok, tunjangan, bonus, total_gaji;

        System.out.println("masukan golongan = ");
        golongan = input.nextInt();

        if(golongan==1){
            gaji_pokok=2000000;
            tunjangan=gaji_pokok*2/100;
            bonus=0;
            total_gaji=gaji_pokok+tunjangan+bonus;
            System.out.println("jumlah gajinya adalah " + total_gaji);
        }else if(golongan==2){
            gaji_pokok=2500000;
            tunjangan=gaji_pokok*2/100;
            bonus=100000;
            total_gaji=gaji_pokok+tunjangan+bonus;
            System.out.println("jumlah gajinya adalah " + total_gaji);
        }else if(golongan==3){
            gaji_pokok=3000000;
            tunjangan=gaji_pokok*2/100;
            bonus=200000;
            total_gaji=gaji_pokok+tunjangan+bonus;
            System.out.println("jumlah gajinya adalah " + total_gaji);
        }else if(golongan==4){
            gaji_pokok=4000000;
            tunjangan=gaji_pokok*2/100;
            bonus=300000;
            total_gaji=gaji_pokok+tunjangan+bonus;
            System.out.println("jumlah gajinya adalah " + total_gaji);
        }else{
            System.out.println("golongan tidak tersedia");
        }
    }
}
