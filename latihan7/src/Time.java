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
public class Time {
    int h, m, s;
    Scanner scan = new Scanner(System.in);
    
    void BacaTime() {
        System.out.print("Jam (0..23): ");
        h = scan.nextInt();
        System.out.print("Menit (0..59): ");
        m = scan.nextInt();
        System.out.print("Detik (0..59): ");
        s = scan.nextInt();
    }
    
    void TulisTime() {
        System.out.println(h + ":" + m + ":" + s);
    }
}
