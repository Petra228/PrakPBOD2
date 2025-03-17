public class Date{
    private int hari, bulan, tahun;

    public Date(){
        hari = 1;
        bulan = 1;
        tahun = 0;
    }

    public Date(int hari, int bulan, int tahun){
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getHari(){
        return hari;
    }

    public void setHari(int hari){
        this.hari = hari;
    }

    public int getBulan(){
        return bulan;
    }

    public void setBulan(int bulan){
        this.bulan = bulan;
    }

    public int getTahun(){
        return tahun;
    }

    public void setTahun(int tahun){
        this.tahun = tahun;
    }

    public void printDate(){
        String[] ListBulan = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
        System.err.println(hari + " " + ListBulan[bulan-1] +  " " +tahun);
    }
}