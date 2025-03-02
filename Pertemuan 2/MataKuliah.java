/* Nama File    : MataKuliah.java
 * Deskripsi    : atribut dan method class MataKuliah
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 26 Februari 2025
 */

public class MataKuliah{
    private String idMatKul, nama;
    private int sks;

    public MataKuliah(){
        idMatKul = "";
        nama = "";
        sks = 0;
    }
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks ;
    }

    public String getIDMatKul(){
        return idMatKul;
    }
    public String getNama(){
        return nama;
    }
    public int getSKS(){
        return sks;
    }

    public void setIDMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setSKS(int sks){
        this.sks = sks;
    }
}