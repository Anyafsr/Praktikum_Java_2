/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817220021_AnyaFidela;

/**
 *
 * @author User
 */
public class mangga {
    String nama_mangga;  
    float berat;
    int jumlah_beli;
    float total_berat;
    int total_harga;
    int harga_mangga;
    
    public mangga(String mangga, float berat, int beli, float tberat, int harga){
         this.nama_mangga = mangga;
         this.berat = berat;
         this.jumlah_beli = beli;
         this.total_berat= tberat; 
         this.harga_mangga = harga; 
    }
    
    public int total_harga(){ 
        total_harga = harga_mangga * jumlah_beli;
        return total_harga; 
    }
    
    public float total_berat(){ 
       this.total_berat = jumlah_beli * berat;
        return  total_berat;  
    }

    //Method//
     public void displayStatus(){ 
        System.out.println("Nama Mangga : " +nama_mangga);
        System.out.println("Berat : "  +berat+ "kg");
        System.out.println("Jumlah Beli : " +jumlah_beli);
        System.out.println("Total berat : "+total_berat+ "kg");
        System.out.println("Total harga : Rp." +total_harga());
    }
}
