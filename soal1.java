/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert3;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class soal1 {
 public static void main(String[] args) {
     
     try ( Scanner input = new Scanner(System.in)) {
         
         System.out.print("Masukkan bilangan 1 : ");
         int b1 = input.nextInt();
         
         System.out.print("Masukkan bilangan 2 : ");
         int b2 = input.nextInt();
         
            if (b1 % 2 == 0 && b2 % 2 == 0) {
                int penjumlahan = b1 + b2;
                System.out.println("Hasil penjumlahan: " + penjumlahan);
            } else {
                int perkalian = b1 * b2;
                System.out.println("Hasil perkalian: " + perkalian);
            }
        }
    }
}