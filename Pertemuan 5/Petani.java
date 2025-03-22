import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor, Mutator
    public String getAsalKota() { 
        return asal_kota; 
    }
    public void setAsalKota(String asal_kota) { 
        this.asal_kota = asal_kota; 
    }
    public static int getCounterPetani() { 
        return counterPetani; 
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 1;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
}
