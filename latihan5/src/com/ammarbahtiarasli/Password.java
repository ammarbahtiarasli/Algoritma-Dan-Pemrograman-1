package com.ammarbahtiarasli;

import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        String password;
        boolean isLogin = false;
        int i = 0;
        Scanner input = new Scanner(System.in);

//menggunakan do while
        do{
            System.out.print("masukan password anda = ");
            password = input.next();
            if (password.equalsIgnoreCase("asd")) {
                System.out.println("Selamat Datang");
                isLogin = true;
                break;
            }
            else{
                System.out.println("password yang anda masukan salah, silakan coba lagi");
                i++;
            }
        }
        while (i<3);
        if(!isLogin){
            System.out.println("anda telah di blokir");
        }



//           menggunakan while
//           while(i<3){
//                System.out.print("masukan password anda = ");
//                password = input.next();
//                if (password.equalsIgnoreCase("asd")) {
//                    System.out.println("Selamat Datang");
//                    isLogin = true;
//                    break;
//                }
//                else{
//                    System.out.println("password yang anda masukan salah, silakan coba lagi");
//                    i++;
//                }
//           }
//           if(isLogin != true){
//             System.out.println("anda telah di blokir");
//         }

//             menggunakan for
//           for (int j = 0; j < 3; j++) {
//            System.out.print("masukan password anda = ");
//                password = input.next();
//                if (password.equalsIgnoreCase("asd")) {
//                    System.out.println("Selamat Datang");
//                    isLogin = true;
//                    break;
//                }
//                else{
//                    System.out.println("password yang anda masukan salah, silakan coba lagi");
//                }
//        }
//           if(isLogin != true){
//             System.out.println("anda telah di blokir");
//         }
    }
}
