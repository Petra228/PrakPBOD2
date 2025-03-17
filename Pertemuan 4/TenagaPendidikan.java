public class TenagaPendidikan extends Pegawai{
    private Date bup;
    private String bidang;

    public TenagaPendidikan(){
        super();
        bup = new Date(2,1,55);
        bidang = "-";
    }

    public TenagaPendidikan(String nip, String nama, Date tanggalLahir, Date tmt, int gaji, String bidang){
        super(nip, nama, tanggalLahir, tmt, gaji);
        this.bidang = bidang;
        if(this.getTanggalLahir().getBulan() == 12){
            this.bup = new Date(1, 1, this.getTanggalLahir().getTahun()+56);
        }
        else{
            this.bup = new Date(1, this.getTanggalLahir().getBulan() + 1, this.getTanggalLahir().getTahun()+55);
        }
        if(this.getTMT().getBulan() <= 3){
            super.tunjangan = (1.0/100) * (2025 - this.getTMT().getTahun()) * gaji;
        }
        else{
            super.tunjangan = (1.0/100) * (2024 - this.getTMT().getTahun()) * gaji;
        }
    }

    public Date getBUP(){
        return bup;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public double getTunjangan(){
        return tunjangan;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.err.println("Jabatan\t\t\t: Tenaga Pendidikan");
        System.err.println("Bidang\t\t\t: "+ bidang);
        if(this.getTMT().getBulan() < 3){
            System.err.println("Masa Kerja\t\t: " + (2025-this.tmt.getTahun()) + " Tahun " + (3 - this.getTMT().getBulan()) + " Bulan");
        }
        else if(this.getTMT().getBulan() == 3){
            System.err.println("Masa Kerja\t\t: " + (2025-this.tmt.getTahun()) + " Tahun ");
        }
        else{
            System.err.println("Masa Kerja\t\t: " + (2024-this.tmt.getTahun()) + " Tahun " + (this.getTMT().getBulan() - 3) + " Bulan");
        }
        System.err.println("Tunjangan\t\t: " + tunjangan);
    }
}