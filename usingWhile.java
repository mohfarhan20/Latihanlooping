package com.company;
import java.util.Scanner;
public class usingWhile {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
	// write your code here
        System.out.println(" ====== Program menjumlahkan angka dengan rentang 1======= ");
        int nilaiAwal,nilaiAkhir,total;
        System.out.println(" Masukkan Nilai Awal = ");
        nilaiAwal = userInput.nextInt();
        System.out.println(" Masukkan Nilai Akhir = ");
        nilaiAkhir = userInput.nextInt();

        total = 0;

        while (nilaiAwal<= nilaiAkhir){
            total = total+nilaiAwal;
            System.out.println(" ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }
}
