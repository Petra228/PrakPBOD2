public class DosenTamu extends Pegawai{
    private String nidk, fakultas;
    private Date tanggalKontrakBerakhir;

    public DosenTamu(){
        super();
        nidk = "-";
        fakultas = "-";
        tanggalKontrakBerakhir = new Date();
        super.tunjangan = 0;
    }

    public DosenTamu(String nip, String nama, Date tanggalLahir, Date tmt, int gaji, String nidk, String fakultas, Date kontrak){
        super(nip, nama, tanggalLahir, tmt, gaji);
        this.nidk = nidk;
        this.fakultas = fakultas;
        this.tanggalKontrakBerakhir = kontrak;
        if(this.getTMT().getBulan() <= 3){
            super.tunjangan = (2.5/100) * (2025 - this.getTMT().getTahun()) * gaji;
        }
        else{
            super.tunjangan = (2.5/100) * (2024 - this.getTMT().getTahun()) * gaji;
        }
    }

    public String getNIDK(){
        return nidk;
    }

    public void setNIDK(String nidk){
        this.nidk = nidk;
    }

    public Date getTanggalKontrak(){
        return tanggalKontrakBerakhir;
    }

    public void setTanggalKontrak(Date kontrak){
        this.tanggalKontrakBerakhir = kontrak;
    }

    public void printMasaAkhirKontrak(){
        System.err.println((this.getTanggalKontrak().getTahun()*12 + this.getTanggalKontrak().getBulan()) - (2025*12+3) + " Bulan");
    }

    public double getTunjangan(){
        return tunjangan;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.err.println("NIDK\t\t\t: "+ nidk);
        System.err.println("Jabatan\t\t\t: Dosen Tamu");
        System.err.println("Fakultas\t\t: "+ fakultas);
        if(this.getTMT().getBulan() < 3){
            System.err.println("Masa Kerja\t\t: " + (2025-this.tmt.getTahun()) + " Tahun " + (3 - this.getTMT().getBulan()) + " Bulan");
        }
        else if(this.getTMT().getBulan() == 3){
            System.err.println("Masa Kerja\t\t: " + (2025-this.tmt.getTahun()) + " Tahun ");
        }
        else{
            System.err.println("Masa Kerja\t\t: " + (2024-this.tmt.getTahun()) + " Tahun " + (this.getTMT().getBulan() - 3) + " Bulan");
        }
        System.err.print("Masa Kontrak\t: ");
        printMasaAkhirKontrak();
        System.err.println("Tunjangan\t\t: " + tunjangan);
    }
}