package basic;

import java.util.Scanner;

public class menghitungLuasLingkaran {
    // Luas lingkaran:  Phi * R* R
    // Phi=22/7 atau Phi=3.14
    // R,Luas: real
    // input(R)
    // Luas=PhixRxR
    // output(Luas)


    public static void main(String[] args ){

        float phi = 22/7, r;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai r : ");r = sc.nextFloat();
        float luas = phi * r * r;
        System.out.println("Luas = " +phi*r*r +" cm");
    }
}
