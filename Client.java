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
public class Client implements Laundry {
    private ArrayList<String> namaClient = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>(); 
        
    public Client() { 
        this.namaClient.add("ana"); 
        this.alamat.add("sawojajar"); 
        this.telepon.add("08123456789"); 
        this.saldo.add(200000); 
         
        this.namaClient.add("ara"); 
        this.alamat.add("tanjung"); 
        this.telepon.add("08198765432"); 
        this.saldo.add(300000); 
    } 
    public void setSaldo(int saldo){ 
        this.saldo.add(saldo); 
    } 
    public int getSaldo(int idClient){ 
        return this.saldo.get(idClient); 
    }        
    public void editSaldo(int idClient, int saldo){ 
        this.saldo.set(idClient, saldo);; 
    }       
    public int getJmlClient(){ 
        return this.saldo.size(); 
    }
     @Override 
    public void setNama(String namaClient ){ 
        this.namaClient.add(namaClient); 
    } 
     
    @Override 
    public void setAlamat(String alamat ){ 
        this.alamat.add(alamat); 
    } 
    @Override 
    public void setTelepon(String telepon ){ 
         this.telepon.add(telepon); 
    } 
     
    @Override 
    public String getNama(int idClient){ 
        return this.namaClient.get(idClient); 
    } 
     
    @Override 
    public String getAlamat(int idClient){ 
        return this.alamat.get(idClient); 
    } 
     
    @Override 
    public String getTelepon(int idClient){ 
        return this.telepon.get(idClient); 
    }
}
