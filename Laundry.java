/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laundry;

/**
 *
 * @author SMK TELKOM 001
 */
public interface Laundry {

    public void setNama(String nama);
    public void setAlamat(String alamat); 
    public void setTelepon(String telepon); 
     
    public String getNama(int id); 
    public String getAlamat(int id); 
    public String getTelepon(int id);  
    
}
