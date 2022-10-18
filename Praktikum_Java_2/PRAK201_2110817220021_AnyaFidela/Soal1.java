/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817220021_AnyaFidela;

/**
 *
 * @author User
 */
public class Soal1 {
    public static void main(String[] args) {
        mangga arumanis = new mangga("Arumanis", 0.3f, 13, 3.9f, 5000);  
        mangga manalagi = new mangga("Manalagi", 0.5f, 17, 8.5f, 7500); 
        mangga manggamadu = new mangga("Mangga Madu", 0.375f, 12, 4.5f, 6500);
  
        arumanis.displayStatus(); 
        System.out.println("");
        manalagi.displayStatus();
        System.out.println("");
        manggamadu.displayStatus();
        System.out.println("");              
    }
}