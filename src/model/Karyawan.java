package model;

public abstract class Karyawan {
    private String nama;
    private String nip;
    private String alamat;
    
    // Ini constructor
    public Karyawan(String nama, String nip, String alamat) {
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
    }
    
    // Getter methods buat Encapsulation
    public String getNama() {
        return nama;
    }
    
    public String getNip() {
        return nip;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    // Setter methodsnya
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    // Abstract method buat Polymorphism
    public abstract double hitungGaji();
    
    // Method buat ngambil tipe karyawan
    public abstract String getTipeKaryawan();
}