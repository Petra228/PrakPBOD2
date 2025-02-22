/* Nama File    : Garis.java
 * Deskripsi    : atribut dan method class garis
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 19 Februari 2025
 */

public class Garis {
    Titik awal, akhir;
    static int counterGaris = 0;

    Garis(){
        awal = new Titik(0,0);
        akhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Titik getAwal(){
        return awal;
    }

    Titik getAkhir(){
        return akhir;
    }

    void setAwal(Titik T){
        awal = T;
    }

    void setAkhir (Titik T){
        akhir = T;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double panjangGaris(){
        return Math.sqrt((Math.pow(awal.getAbsis() - akhir.getAbsis(), 2)) + (Math.pow(awal.getOrdinat() - akhir.getOrdinat(), 2)));
    }

    double getGradien(){
        return (akhir.getOrdinat()-awal.getOrdinat())/(akhir.getAbsis()-awal.getAbsis());
    }

    Titik getTitikTengah(){
        return new Titik(awal.getAbsis() + (akhir.getAbsis() - awal.getAbsis())/2, awal.getOrdinat() + (akhir.getOrdinat() - awal.getOrdinat())/2);
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Awal (" + awal.getAbsis() + "," + awal.getOrdinat() + ") Akhir (" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")"); 
    }

    void printPersamaan(){
        System.out.println("Garis yang dibentuk dari titik (" + awal.getAbsis() + "," + awal.getOrdinat() + ") dan (" + akhir.getAbsis() + "," + akhir.getOrdinat() + ") mempunyai persamaan garis y = " + this.getGradien() + "x + " + (awal.getOrdinat() - this.getGradien() * awal.getAbsis()));
    }
}