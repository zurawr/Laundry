/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;
import java.util.ArrayList; 
import java.util.Scanner;

/**
 *
 * @author SMK TELKOM 001
 */
public class Transaksi {
    private ArrayList<Integer> idJenis = new ArrayList<Integer>();     
    private ArrayList<Integer> banyak = new ArrayList<Integer>();     
    private ArrayList<Integer> idClient = new ArrayList<Integer>();     
     
    public Transaksi() {         
        this.idClient.add(0);
        this.idJenis.add(0);         
        this.banyak.add(2); 
 
        this.idClient.add(0);         
        this.idJenis.add(1);         
        this.banyak.add(3); 
 
        this.idClient.add(1);         
        this.idJenis.add(0);         
        this.banyak.add(1); 
 
        this.idClient.add(1);         
        this.idJenis.add(2);         
        this.banyak.add(2); 
    }
    public void prosesTransaksi(Client client, Transaksi transaksi, Jenis jenis){ 
        Scanner myObj = new Scanner(System.in);   
        System.out.println("Silahkan berlaundry");         
        System.out.println("Masukkan ID Client");         
        int idClient = myObj.nextInt();   
        System.out.println("Selamat datang "+client.getNama(idClient)); 
        ArrayList<Integer> idJenis = new ArrayList<Integer>(); 
        ArrayList<Integer> banyak = new ArrayList<Integer>();        
        int i=0;        
        int temp=0;         
        do{ 
            System.out.println("Masukkan kode jenis :");             
            temp=myObj.nextInt();             
            if (temp!=99){                 
                idJenis.add(temp);
            } 
                System.out.print(jenis.getNamaJenis(idJenis.get(i))+ " sebanyak : "); 
                banyak.add(myObj.nextInt());                 i++; 
        }while (temp!=99);
        
        System.out.println("Transaksi laundry "+client.getNama(idClient)+" sebagai berikut"); 
        System.out.println("Nama Jenis \tQty \tHarga \tJumlah \t"); 
           int total=0;         
           int x = idJenis.size();         
           for (int j = 0; j < x; j++){ 
           int jumlah=banyak.get(j) * jumlah.getHarga(idJenis.get(j));             
           total+=jumlah; 
            System.out.println(jenis.getNamaJenis(idJenis.get(j))+"\t"+                     
                idJenis.get(j)+"\t"+ 
                jenis.getHarga(idJenis.get(j))+"\t"+jumlah); 
            transaksi.setTransaksi(jenis, idClient, idJenis.get(j), banyak.get(j)); 
        }
        System.out.println("Total Belanja : "+total); 
        client.editSaldo(idClient, client.getSaldo(idClient)-total);     
}  

public void setTransaksi(Jenis jenis, int idClient, int idJenis, int banyaknya){ 
        this.idClient.add(idClient);         
        this.idJenis.add(idJenis);         
        this.banyak.add(banyaknya); 
        jenis.editDurasi(idJenis, jenis.getDurasi(idJenis)-banyaknya);    
    }      
    public int getIdJenis(int id){         
        return this.idJenis.get(id); 
    }        
    public int getBanyaknya(int id){         
        return this.banyak.get(id); 
    }        
    public int getIdClient(int id){         
        return this.idClient.get(id); 
    }            
    public int getJmlTransaksi(){         
        return this.idClient.size(); 
    }            
}

