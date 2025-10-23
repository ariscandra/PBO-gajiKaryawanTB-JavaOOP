package service;

import model.Karyawan;
import java.util.*;
import java.text.NumberFormat;

public class ManajemenGaji {
    private List<Karyawan> daftarKaryawan;
    
    // constructor
    public ManajemenGaji() {
        this.daftarKaryawan = new ArrayList<>();
    }
    
    // Method buat menambah karyawan
    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
        System.out.println("Karyawan " + karyawan.getNama() + " berhasil ditambahkan.");
    }
    
    // Method buat nampilkan total gaji semua karyawan
    public void tampilkanTotalGaji() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("              SISTEM MANAJEMEN GAJI TOKO BUKU ARIS");
        System.out.println("=".repeat(70));
        
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Tidak ada data karyawan.");
            return;
        }
        
        // buat formatting rupiah, sama supresswarning supaya gada warning kuning
        @SuppressWarnings("deprecation")
		NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        double totalGajiSeluruh = 0;
        
        System.out.println("\nDAFTAR GAJI KARYAWAN:");
        System.out.println("-".repeat(70));
        
        int nomor = 1;
        for (Karyawan karyawan : daftarKaryawan) {
            double gaji = karyawan.hitungGaji();
            totalGajiSeluruh += gaji;
            
            System.out.println("\n" + nomor + ". DATA KARYAWAN");
            System.out.println("   Nama              : " + karyawan.getNama());
            System.out.println("   NIP               : " + karyawan.getNip());
            System.out.println("   Alamat            : " + karyawan.getAlamat());
            System.out.println("   Tipe Karyawan     : " + karyawan.getTipeKaryawan());
            System.out.println("   Gaji yang Diterima: " + formatRupiah.format(gaji));
            System.out.println("   " + "-".repeat(66));
            
            nomor++;
        }
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("TOTAL GAJI SELURUH KARYAWAN: " + formatRupiah.format(totalGajiSeluruh));
        System.out.println("JUMLAH KARYAWAN: " + daftarKaryawan.size() + " orang");
        System.out.println("=".repeat(70));
    }
    
    // Method untuk mendapatkan jumlah karyawan
    public int getJumlahKaryawan() {
        return daftarKaryawan.size();
    }
}