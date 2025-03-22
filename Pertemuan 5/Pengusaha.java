import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor, Mutator
    public String getNpwp() { 
        return npwp; 
    }
    public void setNpwp(String npwp) { 
        this.npwp = npwp; 
    }
    public static int getCounterPengusaha() { 
        return counterPengusaha; 
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 0;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}
