/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Pembuat   : Patriot Antaras Bangsa / 24060123130100
 * Tanggal   : 5 Maret 2025
 */

 //class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!"; //penggunaan asersi seharusnya menggunakan if else, asersi diletakkan di else.
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " 
                            +kelilingLingkaran);
    }
}
