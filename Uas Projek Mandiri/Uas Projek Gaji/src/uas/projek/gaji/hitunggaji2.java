/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.projek.gaji;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class hitunggaji2 {
public static void main(String[] args ){
String nama, golongan, kerja;
int jamkerja = 0;
int jamlembur = 200;
int gajipokok = 0;
int totalgaji = 0;
int insentif = 0;
int pajak = 0;

Scanner sc = new Scanner(System.in);

System.out.println("Masukkan Nama: ");
nama = sc.nextLine();

System.out.println("Masukkan Jam Kerja: ");
kerja = sc.nextLine();

if(jamkerja > 200){
jamlembur = jamkerja - 200;
insentif = jamlembur * 10000;
}
else if(jamkerja < 200){
jamlembur = jamkerja-200;
insentif = jamlembur * 0;
}
}
}
 
