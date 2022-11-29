package basic;

import java.util.Scanner;

public class menghitungLuas {
    public static void main(String[] args ){

        float panjang,lebar,luas;

        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang : ");
        panjang = sc.nextFloat();
        System.out.print("Lebar : ");
        lebar = sc.nextFloat();
        luas = panjang*lebar;
        System.out.println("Luas = " +panjang*lebar);
    }
}
