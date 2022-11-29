package com.ammarbahtiarasli;

import java.util.Scanner;

public class MenghitungSelisihDuaJam {
    public static void main(String[] args) {
        int h2, m2,s2, h1, m1, s1;
        int sj, sh, sm, ss;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jam ke satu : ");
        h1 = input.nextInt();
        System.out.print("menit : ");
        m1 = input.nextInt();
        System.out.print("detik : ");
        s1 = input.nextInt();
        System.out.println("---------------");
        System.out.print("masukkan Jam kedua : ");
        h2 = input.nextInt();
        System.out.print("menit : ");
        m2 = input.nextInt();
        System.out.print("detik : ");
        s2 = input.nextInt();

        sj = (h2 * 3600 + m2 * 60 + s2)-(h1 * 3600 + m1 * 60 + s1);

        sh = sj/3600;
        sm = (sj % 3600) / 60;
        ss = (sj % 3600) % 60;

        System.out.println("Selisih dari "+h1+" jam "+m1+" menit "+s1+" detik dan "+h2+" jam "+m2+" menit "+s2+" detik Adalah : ");
        System.out.println(sh+"jam "+sm+ "menit "+ss+"detik");

    }
}
