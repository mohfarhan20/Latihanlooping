package com.company;
import  java.util.Scanner;
public class usingDoWhile {
    public static void main (String [] args){
        Scanner volvox = new Scanner(System.in);
        int nilaiAwal,nilaiAkhir,total;
        System.out.println("===== Program menghitung deret aritmatika =====");
        System.out.println(" Masukkan nilai awal = ");
        nilaiAwal= volvox.nextInt();
        System.out.println(" Masukkan nilai akhir");
        nilaiAkhir= volvox.nextInt();
        total = 0;
        do{
            total= total+nilaiAwal;
            System.out.println(" ditambah " + nilaiAwal+ " menjadi" + total);
            nilaiAwal++;
        } while (nilaiAwal<=nilaiAkhir);


    }
}
