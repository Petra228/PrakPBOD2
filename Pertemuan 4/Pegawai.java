public class Pegawai{
    protected String nip, nama;
    protected Date tanggalLahir, tmt;
    protected int gajiPokok;
    protected double tunjangan;

    public Pegawai(){
        nip = "-";
        nama = "-";
        Date tanggalLahir = new Date();
        Date tmt = new Date();
        gajiPokok = 0;
        tunjangan = 0;
    }

    public Pegawai(String nip, String nama, Date tanggalLahir, Date tmt, int gaji){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gaji;
        this.tunjangan = 0;
    }

    public String getNIP(){
        return nip;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Date getTanggalLahir(){
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggal){
        this.tanggalLahir = tanggal;
    }

    public Date getTMT(){
        return tmt;
    }

    public void setTMT(Date tmt){
        this.tmt = tmt;
    }

    public int getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(int gaji){
        this.gajiPokok = gaji;
    }

    public void printInfo(){
        System.err.println("NIP\t\t\t\t: " + nip);
        System.err.println("Nama\t\t\t: " + nama);
        System.err.print("Tanggal Lahir\t: ");
        tanggalLahir.printDate();
        System.err.print("TMT\t\t\t\t: ");
        tmt.printDate();
        System.err.println("Gaji Pokok\t\t: " + gajiPokok);
    }
}