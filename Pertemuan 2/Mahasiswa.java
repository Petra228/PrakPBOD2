/* Nama File    : Mahasiswa.java
 * Deskripsi    : atribut dan method class Mahasiswa
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 26 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa{
    private String nim, nama, prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatKul = new ArrayList<>();
    }

    public String getNIM(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }
    public ArrayList<MataKuliah> getListMatKul(){
        return listMatKul;
    }
    public Dosen getDosen(){
        return dosenWali;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setDosenWali(Dosen dosen){
        dosenWali = dosen;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public int getJumlahSKS(){
        int sum = 0;
        for(int i = 0 ; i<listMatKul.size() ; i++){
            sum += listMatKul.get(i).getSKS();
        }
        return sum;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.print("List Matkul: ");
        for (int i = 0 ; i < listMatKul.size() ; i++){
            System.out.print(listMatKul.get(i).getNama() + " ; ");
        }
        System.out.println("");
        System.out.println("Dosen Wali:" + "\tNIP: " + dosenWali.getNIP() + "\n\t\t\tNama: " + dosenWali.getNama() + "\n\t\t\tProdi: " + dosenWali.getProdi());
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " dengan nomor plat " + kendaraan.getNoPlat());
    }
}