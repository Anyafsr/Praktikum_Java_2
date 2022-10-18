/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK202_2110817220021_AnyaFidela.PRAK202_2110817220021_AnyaFidela;

/**
 *
 * @author User
 */
public class Soal2Main {
    public static void main(String[] args) {
        // TODO code application logic here
        mobil mobil1 = new mobil();
        mobil1.merek = "Toyota Raize";
        mobil1.tahun_keluaran = "2021";
        mobil1.kapasitas = 988;
        mobil1.harga = 202700000;
        mobil1.info();
        mobil1.setPemilik("Kasel");
        System.out.println("Pemilik Mobil: " + mobil1.getPemilik());
        System.out.println("Pajak Mobil: Rp. " + mobil1.getPajak());
    }
}
