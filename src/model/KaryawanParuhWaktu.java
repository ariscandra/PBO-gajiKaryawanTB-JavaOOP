package model;

public class KaryawanParuhWaktu extends Karyawan {
    private int jamKerja;
    private int tarifPerJam;
    
    // konstructor
    public KaryawanParuhWaktu(String nama, String nip, String alamat, int jamKerja, int tarifPerJam) {
        super(nama, nip, alamat);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }
    
    // Getter dan Setter
    public int getJamKerja() {
        return jamKerja;
    }
    
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    public int getTarifPerJam() {
        return tarifPerJam;
    }
    
    public void setTarifPerJam(int tarifPerJam) {
        this.tarifPerJam = tarifPerJam;
    }
    
    // poly - Override method hitungGaji()
    @Override
    public double hitungGaji() {
        return jamKerja * tarifPerJam;
    }
    
    @Override
    public String getTipeKaryawan() {
        return "Karyawan Paruh Waktu";
    }
}