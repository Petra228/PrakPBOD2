/* Nama File    : Kendaraan.java
 * Deskripsi    : atribut dan method class Kendaraan
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 26 Februari 2025
 */

public class Kendaraan{
    private String noPlat, jenis;

    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }
    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}