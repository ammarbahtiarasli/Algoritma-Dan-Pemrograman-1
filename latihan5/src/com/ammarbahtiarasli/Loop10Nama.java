package com.ammarbahtiarasli;

import java.util.Scanner;

public class Loop10Nama {
    public static void main(String[] args) {
        // Looping 10 nama
        String nama;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("nama =");nama=input.nextLine();
            System.out.println("hello "+ nama);
        }
    }
}
