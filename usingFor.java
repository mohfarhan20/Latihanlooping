package com.company;
import java.util.Scanner;
public class usingFor {
    public static void main (String [] args){
        Scanner gip = new Scanner(System.in);
        int nilaiAwal,nilaiAkhir,total;
        System.out.println("===== Program menghitung deret aritmatika ===== ");
        System.out.println(" Masukkan nilai Awal : ");
        nilaiAwal = gip.nextInt();
        System.out.println(" Masukkan nilai Akhir ");
        nilaiAkhir = gip.nextInt();
        total = 0;


        for (;nilaiAwal<= nilaiAkhir; nilaiAwal++) {
            total = total+nilaiAwal;
            System.out.println(" ditambah " + nilaiAwal+ " menjadi "+ total);

        }
    }
}
