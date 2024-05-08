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
public class Petugas implements Laundry {
    private ArrayList<String> namaPetugas = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> jabatan = new ArrayList<Integer>(); 
     
    public Petugas() { 
        this.namaPetugas.add("admin"); 
        this.alamat.add("kedung kandang"); 
        this.telepon.add("0811223344556"); 
        this.jabatan.add(0); 
    } 
    public void setJabatan(int jabatan ){ 
        this.jabatan.add(jabatan); 
    } 
    public int getJabatan(int id){ 
        return this.jabatan.get(id); 
    }        
    public int getJmlPetugas(){ 
        return this.namaPetugas.size(); 
    }       
    @Override 
    public void setNama(String namaPetugas ){ 
        this.namaPetugas.add(namaPetugas); 
    }    
    @Override 
    public void setAlamat(String alamat ){ 
        this.namaPetugas.add(alamat);
    }
     @Override 
    public void setTelepon(String telepon ){ 
        this.namaPetugas.add(telepon); 
    }      
    @Override 
    public String getNama(int idPetugas){ 
        return this.namaPetugas.get(idPetugas); 
    }      
    @Override 
    public String getAlamat(int idPetugas){ 
        return this.alamat.get(idPetugas); 
    }      
    @Override 
    public String getTelepon(int idPetugas){ 
        return this.telepon.get(idPetugas); 
    }
    
}
