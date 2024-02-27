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
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();
        
        System.out.print("Masukkan nilai TUGAS: ");
        double tugas = input.nextDouble();
        
        double hasil1 = (uts * 35 / 100);
        double hasil2 = (uas * 45 / 100);
        double hasil3 = (tugas * 20 / 100);
        
        double NA = hasil1 + hasil2 + hasil3; 
        
        if (NA >= 80 && NA <= 100) {
            System.out.println("A");
        } else if (NA >= 70 && NA < 80) {
            System.out.println("B");
        } else if (NA >= 50 && NA < 70) {
            System.out.println("C");
        }
    }
}