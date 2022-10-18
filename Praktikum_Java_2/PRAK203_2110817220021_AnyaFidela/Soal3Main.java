/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK203_2110817220021_AnyaFidela;

/**
 *
 * @author User
 */
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // pada baris ini terdapat error karena tidak menambahkan titik koma diakhir ;
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        //memberi value pada umur
        p1.umur=17; 
        p1.setJabatan("Assasin"); 
        
        //sebelumnya pada baris ini terdapat "Pegawai" yang menyebabkan hasil output tidak sesuai yang diminta soal, jadi hapus saja
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //sebelumnya pada baris ini kurang lengkap karena tidak mencetak tahun pada output, jadi kita tambahkan tahun
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun ");
    }
}
