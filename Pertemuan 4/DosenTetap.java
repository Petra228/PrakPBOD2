public class DosenTetap extends Pegawai{
    private String nidn, fakultas;
    private Date bup;

    public DosenTetap(){
        super();
        nidn = "-";
        fakultas = "-";
        bup = new Date(1,2,65);
        super.tunjangan = 0;
    }

    public DosenTetap(String nip, String nama, Date tanggalLahir, Date tmt, int gaji, String nidn, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gaji);
        this.nidn = nidn;
        this.fakultas = fakultas;
        if(this.getTanggalLahir().getBulan() == 12){
            this.bup = new Date(1, 1, this.getTanggalLahir().getTahun()+66);
        }
        else{
            this.bup = new Date(1, this.getTanggalLahir().getBulan() + 1, this.getTanggalLahir().getTahun()+65);
        }
        if(this.getTMT().getBulan() <= 3){
            super.tunjangan = (2.0/100) * (2025 - this.getTMT().getTahun()) * gaji;
        }
        else{
            super.tunjangan = (2.0/100) * (2024 - this.getTMT().getTahun()) * gaji;
        }
    }

    public String getNIDN(){
        return nidn;
    }

    public void setNIDN(String nidn){
        this.nidn = nidn;
    }

    public Date getBUP(){
        return bup;
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
        System.err.println("NIDN\t\t\t: "+ nidn);
        System.err.println("Jabatan\t\t\t: Dosen Tetap");
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
        System.err.print("BUP\t\t\t\t: ");
        bup.printDate();
        System.err.println("Tunjangan\t\t: " + tunjangan);
    }
}