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
public class Penerbangan {
    String nop, bAsal, bTujuan;
    Date ddep = new Date();
    Date darr = new Date();
    Time jdep = new Time();
    Time jarr = new Time();
    Scanner scan = new Scanner(System.in);
    
    void inputData() {
        System.out.print("XNOP: ");
        nop = scan.next();
        System.out.print("Bandara Asal: ");
        bAsal = scan.next();
        System.out.print("Bandara Tujuan: ");
        bTujuan = scan.next();
        System.out.println("==============================");
        System.out.println("Tanggal Penerbangan: ");
        ddep.BacaDate();
        System.out.println("Jam Penerbangan: ");
        jdep.BacaTime();
        System.out.println("Tanggal Turun: ");
        darr.BacaDate();
        System.out.println("Jam Sampai: ");
        jarr.BacaTime();
    }
    
    void printData() {
        System.out.println("==============================");
        System.out.println("Bandara Asal: " + bAsal);
        System.out.println("Bandara Tujuan: " + bTujuan);
        System.out.println("Tanggal Penerbangan: ");
        ddep.TulisDate();
        System.out.println("Jam Penerbangan: ");
        jdep.TulisTime();
        System.out.println("Tanggal Turun: ");
        darr.TulisDate();
        System.out.println("Jam Sampai: ");
        jarr.TulisTime();
    }
    
    public static void main(String[] args) {
        Penerbangan P = new Penerbangan();
        
        System.out.println("Program Data Penerbangan 1");
        
        P.inputData();
        P.printData();
        
    }
}
