package com.company;
import java.util.Scanner;
public class deretAritmatika {
    public static void main (String [] args){
        int b,s;
        Scanner su = new Scanner(System.in);
        System.out.println("=== INI ADALAH PROGRAM MENGHITUNG DERET ARITMATIKA === ");
        // Pada Kesempatan ini menghitung deret dengan beda 3 dan u1 = 2

        System.out.print("Masukkan nilai x: ");
        int x = su.nextInt();

        int a = 2;

        for (int i = 1; i <= x; i++) {
            System.out.print(a + " ");
            a += 3;
        }















    }
}
