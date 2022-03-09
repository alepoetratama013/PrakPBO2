
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, tinggi, jarijari;

        int pil, loop;
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pil = input.nextInt();
            if(pil == 1){
                System.out.print("Input Panjang\t: "); panjang = input.nextDouble();
                System.out.print("Input Lebar\t: "); lebar = input.nextDouble();
                System.out.print("Input Tinggi\t: "); tinggi = input.nextDouble();
                Balok balok = new Balok(tinggi, panjang, lebar);
                System.out.println("Luas Persegi Panjang = " + balok.Luas());
                System.out.println("Keliling Persegi Panjang = " + balok.Keliling());
                System.out.println("Volume Balok = " + balok.Volume());
                System.out.println("Luas Permukaan Balok = " + balok.LuasPermukaan());
            }
            else if(pil == 2){
                System.out.print("Input Jari- Jari\t: "); jarijari= input.nextDouble();
                System.out.print("Input Tinggi\t\t: "); tinggi= input.nextDouble();
                Tabung tabung = new Tabung(tinggi, jarijari);
                System.out.println("Luas Lingkaran = " + tabung.Luas());
                System.out.println("Keliling Lingkaran = " + tabung.Keliling());
                System.out.println("Volume Tabung = " + tabung.Volume());
                System.out.println("Luas Permukaan Tabung = " + tabung.LuasPermukaan());
            }
            if(pil==1 || pil==2){
                System.out.print("Ulangi? (Ya: 1 || Tidak: 0) "); loop = input.nextInt();
            }
            else{
                loop =0;
            }
        }while(loop!=0);


    }
}