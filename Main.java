/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author SMK TELKOM 001
 */
public class Main {
    public static void main(String[] args) {
        
        Client client;
        client = new Client() {};
        Petugas petugas = new Petugas();
        Jenis jenis = new Jenis();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();

        // Proses transaksi
        transaksi.prosesTransaksi(client, transaksi, jenis);

        // Menampilkan laporan
        laporan.laporan(jenis);
        laporan.laporan(client);
        laporan.laporan(transaksi, jenis);
    }
}
