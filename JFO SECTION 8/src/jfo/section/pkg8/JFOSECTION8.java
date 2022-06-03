/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jfo.section.pkg8;

import java.util.*;
public class JFOSECTION8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
ArrayList<String> array = new ArrayList<>();


System.out.print("Musim Liga Sepak Bola : ");
int liga = input.nextInt();

double random = Math.random() * liga;

for (int i = 0; i <= liga; i++){
    String musim = input.nextLine();
array.add(musim);
}
System.out.print(array.get((int) random ));
    }

    
}
