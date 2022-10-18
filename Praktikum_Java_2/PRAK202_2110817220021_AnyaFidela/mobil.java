/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK202_2110817220021_AnyaFidela.PRAK202_2110817220021_AnyaFidela;

/**
 *
 * @author User
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class mobil {
    DecimalFormat koma = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    
      String merek;
      int harga;
      String tahun_keluaran;
      int kapasitas;
      private  String pemilik;
      private int pajak;
  
     public void setPemilik(String pemilik){
         this.pemilik = pemilik;
     }
   
     public String getPemilik(){
         return pemilik;
     }
     
     public int getPajak(){
         pajak= (int) (harga*2/100);
         return pajak;
     }
  
    public void info(){
        formatRp.setCurrencySymbol("");
        formatRp.setMonetaryDecimalSeparator(',');
        koma.setDecimalFormatSymbols(formatRp);
        System.out.println("Merek Mobil : " +merek);
        System.out.println("Harga : Rp. "+koma.format(harga));
        System.out.println("Tahun keluaran : " +tahun_keluaran+ " ");
        System.out.println("Kapasitas: "+kapasitas+"cc");
   
    }
}
