package main;

import model.KaryawanKontrak;
import model.KaryawanParuhWaktu;
import service.ManajemenGaji;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM MANAJEMEN GAJI TOKO BUKU ARIS ===\n");
        
        // buat objek ManajemenGaji
        ManajemenGaji manajemenGaji = new ManajemenGaji();
        
        // buat objek KaryawanKontrak
        KaryawanKontrak karyawan1 = new KaryawanKontrak(
            "Aris Candra Muzaffar",
            "KK001",
            "Jl. Danau Aji No. 96 Kutai Kartanegara",
            5000000,
            2000000
        );
        
        // buat objek KaryawanParuhWaktu
        KaryawanParuhWaktu karyawan2 = new KaryawanParuhWaktu(
            "Raihan Fariz Manusia Konyol",
            "PW001",
            "Jl. Jalan Kemana No. 99 Sangatta",
            120,
            50000
        );
        
        // Menambahkan objek tambahan untuk demonstrasi
        KaryawanKontrak karyawan3 = new KaryawanKontrak(
            "Abelia",
            "KK002",
            "Jl. Kesana Atau Kesini No. 21 Samarinda",
            4500000,
            1500000
        );
        
        KaryawanParuhWaktu karyawan4 = new KaryawanParuhWaktu(
            "Lionel Messi",
            "PW002",
            "Jl. Inter Miami No. 10 Florida",
            80,
            45000
        );
        
        // nambahin karyawan ke ManajemenGaji
        System.out.println("+++ Menambahkan Karyawan ke Sistem +++\n");
        manajemenGaji.tambahKaryawan(karyawan1);
        manajemenGaji.tambahKaryawan(karyawan2);
        manajemenGaji.tambahKaryawan(karyawan3);
        manajemenGaji.tambahKaryawan(karyawan4);
        
        // nampilkan total gaji pake poly
        // Method hitungGaji() bakal dipanggil sesuai sama tipe objek masing-masing
        manajemenGaji.tampilkanTotalGaji();
        
        // demostrasi polymorphismnya
        System.out.println("\n\n=== DEMONSTRASI POLYMORPHISM ===");
        System.out.println("Method hitungGaji() dipanggil untuk setiap objek:");
        System.out.println("- KaryawanKontrak: Gaji = gajiPokok + bonusProyek");
        System.out.println("- KaryawanParuhWaktu: Gaji = jamKerja x tarifPerJam");
        System.out.println("\nHasil perhitungan gaji otomatis bakal menyesuaikan dengan tipe karyawan.");
    }
}