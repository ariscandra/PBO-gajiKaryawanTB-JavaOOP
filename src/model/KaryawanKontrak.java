package model;

public class KaryawanKontrak extends Karyawan {
    private int gajiPokok;
    private int bonusProyek;
    
    // konstructor
    public KaryawanKontrak(String nama, String nip, String alamat, int gajiPokok, int bonusProyek) {
        super(nama, nip, alamat);
        this.gajiPokok = gajiPokok;
        this.bonusProyek = bonusProyek;
    }
    
    // Getter dan Setter
    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int getBonusProyek() {
        return bonusProyek;
    }
    
    public void setBonusProyek(int bonusProyek) {
        this.bonusProyek = bonusProyek;
    }
    
    // nerapin polymorphism - Override method hitungGaji()
    @Override
    public double hitungGaji() {
        return gajiPokok + bonusProyek;
    }
    
    @Override
    public String getTipeKaryawan() {
        return "Karyawan Kontrak";
    }
}