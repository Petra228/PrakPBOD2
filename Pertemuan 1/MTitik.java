/* Nama File    : MTitik.java
 * Deskripsi    : main untuk class titik
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 19 Februari 2025
 */
public class MTitik{
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Titik baru dengan koordinat (0,0)
        System.out.println("Jumlah Objek Titik : " + Titik.getCounterTitik()); //mencetak banyak titik yang telah dibuat
        System.out.print("T1 = ");
        T1.printTitik(); //mencetak koordinat T1
        T1.setAbsis(3); //mengubah absis T1 menjadi 3
        T1.setOrdinat(4); //mengubah ordinat T1 menjadi 4
        System.out.print("T1 dengan koordinat baru = ");
        T1.printTitik(); //mencetak koordinat T1
        System.out.println("");

        Titik T0 = new Titik(3,4); //Titik baru dengan koordinat (3,4)
        System.out.println("Jumlah Objek Titik : " + Titik.getCounterTitik()); //mencetak banyak titik yang telah dibuat
        System.out.print("T0 = ");
        T0.printTitik(); //mencetak koodinat T0
        System.out.println("");

        T1.geser(3, 4); //menggeser koordinnat T1 sebesar 3 ke kanan dan 4 keatas
        System.out.print("T1 setelah digeser = ");
        T1.printTitik(); //mencetak koordinat T1 setelah di geser
        System.out.println("");

        T1.refleksiX(); //melakukan refleksi koordinat T1 terhadap sumbu X
        System.out.print("refleksiX dari T1 = ");
        T1.printTitik(); //mencetak koordinat T1 setelah di refleksikan terhadap sumbu X
        System.out.print("refleksiY dari T1 = ");
        T1.refleksiY(); //melakukan refleksi koordinat T1 terhadap sumbu Y
        T1.printTitik(); //mencetak koordinat T1 setelah di refleksikan terhadap sumbu Y
        Titik T2 = T1.getRefleksiX(); //Titik baru yang berupa refleksi dari T1 terhadap sumbu X
        Titik T3 = T1.getRefleksiY(); //Titik baru yang berupa refleksi dari T1 terhadap sumbu Y
        System.out.println("Jumlah Objek Titik : " + Titik.getCounterTitik()); //mencetak banyak titik yang telah dibuat
        System.out.print("T2 = ");
        T2.printTitik(); //mencetak koordinat T2
        System.out.print("T3 = ");
        T3.printTitik(); //mencetak koordinat T3
        System.out.println("");

        System.out.print("Kuadran dari T0 = ");
        System.out.println(T0.getKuadran()); //mencetak kuadran dari T0
        System.out.print("Kuadran dari T1 = ");
        System.out.println(T1.getKuadran()); //mencetak kuadran dari T1
        System.out.print("Kuadran dari T2 = ");
        System.out.println(T2.getKuadran()); //mencetak kuadran dari T2
        System.out.print("Kuadran dari T3 = ");
        System.out.println(T3.getKuadran()); //mencetak kuadran dari T3
        System.out.println("");

        System.out.print("Jarak T1 dengan titik pusat = ");
        System.out.println(T1.getJarakPusat()); //mencetak jarak T1 dengan titik pusat(0,0)
        System.out.print("Jarak T0 dengan titik pusat = ");
        System.out.println(T0.getJarakPusat()); //mencetak jarak T2 dengan titik pusat(0,0)
        System.out.print("Jarak T2 dengan T3 = ");
        System.out.println(T2.getJarak(T3)); //mencetak jarak antara T1 dan T2
    }
}