import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selector
    public String getNama() { 
        return nama; 
        }
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja; 
        }
    public String getAlamat() { 
        return alamat; 
        }
    public double getPendapatan() { 
        return pendapatan; 
        }
    public static int getCounterMns() { 
        return counterMns; 
        }

    // Setter (Mutator)
    public void setNama(String nama) { 
        this.nama = nama; 
        }
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) { 
        this.tgl_mulai_kerja = tgl_mulai_kerja; 
        }
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
        }
    public void setPendapatan(double pendapatan) { 
        this.pendapatan = pendapatan; 
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " Tahun");
        System.out.println("Pajak: " + hitungPajak());
    }

    // Abstract
    public abstract int hitungMasaKerja();
    public abstract double hitungPajak();

}
