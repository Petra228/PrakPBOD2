/* Nama File    : Dosen.java
 * Deskripsi    : atribut dan method class Dosen
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 26 Februari 2025
 */

public class Dosen{
    private String nip,nama,prodi;

    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}