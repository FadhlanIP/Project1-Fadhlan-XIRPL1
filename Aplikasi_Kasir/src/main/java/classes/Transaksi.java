/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Owner
 */
import java.util.ArrayList;

public class Transaksi {
    private String noTransaksi;
    private String namaPemesan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double pajak;
    private double totalBayar;
    private double biayaService=0;

    public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja) {
        this.noTransaksi = no_transaksi;
        this.namaPemesan = nm_pemesan;
        this.tanggal = tanggal;
        this.noMeja = no_meja;

        pesanan = new ArrayList<>();
     }

    public void tambahPesanan(Pesanan pesanan) {
        this.pesanan.add(pesanan);
    }

    public ArrayList<Pesanan> getSemuaPesanan() {
        return pesanan;
    }
    public void setBiayaService(double service){
        this.biayaService = service;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double hitungTotalPesanan() {
        for (int i = 0; i < pesanan.size(); i++) {
            Pesanan psn = pesanan.get(i);
            double harga = psn.getMenu().getHarga();
            totalBayar += (harga * psn.getJumlah());
        }
        return totalBayar;
    }
    //tambahkan
    public double hitungPajak(){
        return totalBayar * pajak;
    }
    //tambahkan
    public double hitungBiayaService(){
        return totalBayar * biayaService;
    }

    public double hitungTotalBayar(double pajak, double service) {
        totalBayar = totalBayar + pajak + service;
        return totalBayar
    }

    public double hitungKembalian(double uang_bayar) {
        return uang_bayar - total bayar; //bisa dibuat validator?

    }

    public void cetakStruk() {
        System.out.println("\======== ALDEBARAMEN ========");
        System.out.println("No Transaksi : "+noTransaksi);
        System.out.println("Pemesan : "+namaPemesan);
        System.out.printin("Tanggal : "+tanggal);

        //cek jika nomor meja kosong, berarti take away
        if(noMeja.equals("")){
            noMeja = "Take Away";
        }

        System.out.println("Meja : "+noMeja);
        System.out.println("=========================");
        for (int 1 = 0; 1 < pesanan.size(); 1++) {
            Pesanan psn = pesanan.get(i);
            Menu m = psn.getMenu();
            String pesanan = psn.getJumlah() + " " + m.getNama_menu() + "\t " + (m.getHarga() + "\t" + (m.getHarga()*psn.getJumlah());

            //jika pesanan kuah, tambah spasi di awal 2
            if (m.getKategori().equals("Kuah")) {
                pesanan = " "+pesanan;
            }
            //Tampilkan pesanan
            System.out.println(pesanan)
        }
    }
}