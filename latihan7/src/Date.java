/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataPenerbangan;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Date {
    int dd, mm, yy;
    Scanner scan = new Scanner(System.in);
    
    void BacaDate() {
        System.out.print("Tanggal(1..31): ");
        dd = scan.nextInt();
        System.out.print("Bulan (1..12): ");
        mm = scan.nextInt();
        System.out.print("Tahun (Lebih dari 0): ");
        yy = scan.nextInt();
    }
    
    void TulisDate() {
        System.out.println(dd + "-" + mm + "-" + yy);
    }
}
