package basic;

import java.util.Scanner;

public class conversiSuhu {
    public static void main(String[] args ){

        float c,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hasil 5/9 = "+ (float)5/9);
        System.out.print("f : ");
        f = sc.nextFloat();
        c =(float)5/9*(f - 32);  //Cascading mengubah hasil bagi
        System.out.println("c = " +c);
    }
}
