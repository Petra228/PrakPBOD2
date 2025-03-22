import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor, Mutator
    public String getNip() { 
        return nip; 
    }
    public void setNip(String nip) { 
        this.nip = nip; 
    }
    public static int getCounterPNS() { 
        return counterPNS; 
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 0;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
}
