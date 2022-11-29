package basic;

import java.util.Scanner;

public class eksBoolean {
    public static void main(String[] args ){
        float B1,B2;
        boolean Sama;
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.print("Bil1 : ");B1=sc.nextFloat();
        System.out.print("Bil2 : ");B2=sc.nextFloat();
        Sama=(B1!=B2);
        System.out.println("Bil1 != Bil2 adalah : "+Sama);
        Sama=(B1==B2);
        System.out.println("Bil1 == Bil2 adalah : "+Sama);
        Sama=(B1<B2);
        System.out.println("Bil1 < Bil2 adalah : "+Sama);
        Sama=(B1>B2);
        System.out.println("Bil1 > Bil2 adalah : "+Sama);

    }
}
