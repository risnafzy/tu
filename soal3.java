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
public class soal3 {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan jumlah peserta : ");
            int peserta = input.nextInt();
            
            int Mobil = peserta / 7;
            if (peserta % 7 != 0) {
                Mobil++;
            }
            
            System.out.println("Jumlah mobil yang disediakan: " + Mobil);
        }
                
    }
}