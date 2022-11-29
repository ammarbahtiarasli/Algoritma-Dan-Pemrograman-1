package basic;

import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args ){

        // f, c : real
        // x, y, step : integer
        // read(x, y, step)
        // f = x
        //while f <= y do
        // c = 5/9 * (f - 32)
        // write(f,c)
        // f = f + step
        // endwhile

        float c, f;
        int x, y, step;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai x : ");x = sc.nextInt();
        System.out.print("Nilai y : ");y = sc.nextInt();
        System.out.print("Nilai step : ");step = sc.nextInt();
        f = x;
        System.out.println("F               C");
        while (f <= y){
            c =(float)5/9*(f - 32);
            System.out.println(f+"        "+c);
            f = f + step;
        }
        System.out.println("Selesai");
    }
}
