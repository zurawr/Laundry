/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;
import java.util.ArrayList;

/**
 *
 * @author SMK TELKOM 001
 */
public class Jenis {
    private ArrayList<String> namaJenis = new ArrayList<String>(); 
    private ArrayList<Integer> durasi = new ArrayList<Integer>(); 
    private ArrayList<Integer> harga = new ArrayList<Integer>(); 
     
    public Jenis() { 
        this.namaJenis.add("selimut"); 
        this.durasi.add(5); 
        this.harga.add(10000); 
 
        this.namaJenis.add("seprei"); 
        this.durasi.add(5); 
        this.harga.add(15000); 
 
        this.namaJenis.add("jeans"); 
        this.durasi.add(2); 
        this.harga.add(5000); 
    } 
 
    public int getJmlJenis(){ 
        return this.namaJenis.size(); 
    } 
    public void setNamaJenis(String namaJenis ){ 
        this.namaJenis.add(namaJenis); 
    } 
    public String getNamaJenis(int idJenis){
         return this.namaJenis.get(idJenis); 
    }   
     
    public void setDurasi(int durasi ){ 
        this.durasi.add(durasi); 
    } 
    public int getDurasi(int idJenis){ 
        return this.durasi.get(idJenis); 
    }     
    public void editDurasi(int idJenis, int durasi){ 
        this.durasi.set(idJenis, durasi);
    }     
 
    public void setHarga(int harga ){ 
        this.harga.add(harga); 
    } 
    public int getHarga(int idJenis){ 
        return this.harga.get(idJenis); 
    }
}
