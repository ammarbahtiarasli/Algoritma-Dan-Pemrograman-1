package com.ammarbahtiarasli;

public class NoEmpat {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;  // a = 0 b = 0 c = 0
        a = 9;                    // a = 9 b = 0 c = 0
        b = 10;                   // a = 9 b = 10 c = 0
        c = a + b;                // a = 9 b = 10 c = 19
        System.out.println(c);    // c = 19
        a = 5;                    // a = 5 b = 10 c = 19
        c = c - 15;               // a = 5 b = 10 c = 4
        System.out.println(c);    // c = 4
        b = 2;
        c = a * b;
        c = 10;
        System.out.println(c);
    }
}
