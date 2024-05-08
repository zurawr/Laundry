/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author SMK TELKOM 001
 */
public class Laporan {
    
    public void laporan(Jenis jenis){
        int x=jenis.getJmlJenis(); 
        System.out.println(); 
        System.out.println("Tabel Jenis"); 
        System.out.println(); 
        System.out.println("Jenis Laundry \tdurasi \tharga"); 
        for (int i = 0; i < x; i++) { 
            System.out.println(jenis.getNamaJenis(i)+"\t"+ jenis.getDurasi(i)+"\t"+jenis.getHarga(i));
        }
    }
}
