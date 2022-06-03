/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.projek.gaji;

import java.util.Scanner;

public class HitungGaji {
public static void main(String[] args){
String nama, golongan, kerja,jam;
int jamkerja = 0;
int jamlembur = 0;
int gajipokok = 0;
int totalgaji = 0;
int insentif = 0;
int pajak = 0;

Scanner sc = new Scanner(System.in);

System.out.println("Masukkan Nama: ");
nama = sc.nextLine();

System.out.println("Masukkan Jam Kerja: ");
jam = sc.nextLine();

if(jamkerja > 200){
jamlembur = jamkerja - 200;
}
else if(jamkerja < 200){
jamlembur = jamkerja - 0;
}


System.out.println("Masukkan Golongan:  ");
golongan = sc.nextLine();

System.out.println("1. Golongan A");
System.out.println("1. Golongan B");
System.out.println("1. Golongan C");
System.out.println("1. Golongan D");
System.out.println("1. Golongan E");

System.out.println("Masukkan Pilihan Golongan: ");

int pilih = sc.nextInt();
if (pilih == 1 ){
gajipokok = 10000000;
insentif = jamlembur ;
}
else if (pilih == 2){
gajipokok = 8000000;
insentif = jamlembur;
}
else if (pilih == 3){
gajipokok = 5000000;
insentif = jamlembur;
}
else if (pilih == 4){
gajipokok = 3500000;
insentif = jamlembur;
}
else if (pilih == 5){
gajipokok = 2000000;
insentif = jamlembur;
}



totalgaji = (gajipokok + insentif);
insentif = (jamlembur * 10000);
}
}