

/* Nama File    : MGaris.java
 * Deskripsi    : main untuk class garis
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 19 Februari 2025
 */

public class MGaris{
    public static void main(String[] args) {
        Garis G1 = new Garis(); //Garis baru dengan titik awal (0,0) dan titik akhir(1,1)
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris()); //mencetak banyak garis yang sudah dibuat
        System.out.print("Garis G1 = ");
        G1.printGaris(); //mencetak koordinat titik awal dan akhir dari G1
        G1.setAwal(new Titik(-1,-1)); //mengubah titik awal G1
        G1.setAkhir(new Titik(3,3)); //mengubah titik akhir G1
        System.out.print("Titik awal G1 setelah dibuah = ");
        G1.getAwal().printTitik(); //mencetak titik awal G1
        System.out.print("Titik akhir G1 setelah dibuah = ");
        G1.getAkhir().printTitik(); //mencetak titik akhir G1
        System.out.println("");

        System.out.println("Panjang garis G1 = " + G1.panjangGaris()); //mencetak panjang garis G1
        System.out.println("Gradien G1 = " + G1.getGradien()); //mencetak gradien dari G1
        System.out.print("Titik tengah dari G1 = ");
        G1.getTitikTengah().printTitik(); //mencetak titik tengah dari G1
        System.out.println("");

        Garis G2 = new Garis(new Titik(2,2), new Titik(4,4)); //Garis baru yang sejajar dengan G1
        Garis G3 = new Garis(new Titik(5,5), new Titik(3,3)); //Garis baru yang tegak lurus dengan G1
        System.out.print("Garis G2 = ");
        G2.printGaris(); //mencetak koordinat titik awal dan akhir dari G2
        System.out.print("Garis G3 = ");
        G3.printGaris(); //mencetak koordinat titik awal dan akhir dari G3
        System.out.println("Apakah G1 dan G2 sejajar? " + G1.isSejajar(G2)); //mencetak boolean yang menjawab isSejajar antara G1 dan G2
        System.out.println("Apakah G1 dan G3 sejajar? " + G1.isSejajar(G3)); //mencetak boolean yang menjawab isSejajar antara G1 dan G3
        System.out.println("Apakah G1 dan G2 tegak lurus? " + G1.isTegakLurus(G2)); //mencetak boolean yang menjawab isTegakLurus antara G1 dan G2
        System.out.println("Apakah G1 dan G3 tegak lurus? " + G1.isTegakLurus(G3)); //mencetak boolean yang menjawab isTegakLurus antara G1 dan G3
        System.out.println("");

        Garis G4 = new Garis(new Titik (-2,0), new Titik(0,4)); //Garis baru dengan titik awal (-2,0) dan titik akhir (0,4)
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris()); //mencetak banyak garis yang sudah dibuat
        System.out.print("Garis G4 = ");
        G4.printGaris(); //mencetak koordinat titik awal dan akhir dari G4
        G4.printPersamaan(); //mencetak persamaan G4 dengan bentuk 'y = mx + c'
    }
}