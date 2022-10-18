/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK203_2110817220021_AnyaFidela;

/**
 *
 * @author User
 */
//pada baris ini terdapat error karena nama class haruslah sama dengan nama file.java
//public class Employee {
public class Pegawai {
    public String nama;
    /* pada class pegawai terdapat kesalahan tipe data di variabel asal, dimana pada variabel tersebut
    menggunakan tipe data char yang dimana tipe data char bisa digunakan untuk satu karakter saja, dan
    digantikan oleh tipe data String */
    //public char asal;
    public String asal; 
    public String jabatan;
    public int umur;
    
    public String getNama(){
        return nama;
    }
    
    //pada baris ini terjadi error karena tipe data char tidak kompatibel, gantilah ke string
    public String getAsal(){
        return asal;
    }
    
    //pada baris sebelumnya, terjadi error karena tidak ada mendeklarasikan variabel j untuk jabatan
    //public void setJabatan(){
    public void setJabatan(String j){
        this.jabatan= j; 
    }
}
