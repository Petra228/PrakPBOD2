import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }

        //test Pegawai 4 & 5
        // Programmer pegawai4 = new Programmer("Zani");
        // Manajer pegawai5 = new Manajer("Ciaconna");

        // ArrayList<Programmer> programmers = new ArrayList<>();
        // ArrayList<Manajer> manajers = new ArrayList<>();
        // programmers.add(pegawai4);
        // manajers.add(pegawai5);
        // for (Programmer prog : programmers) {
        //     prog.tampilData();
        // }
        // for (Manajer man : manajers) {
        //     man.tampilData();
        // }
    }
}

//Manfaat Polimorfisme:
//Polimorfisme memudahkan pengelolaan objek berbeda (Programmer dan Manajer) dalam satu ArrayList bertipe Pegawai, sehingga bisa memanggil method tampilData() tanpa harus tahu tipe aslinya.

//Permasalahan jika menambahkan pegawai4, pegawai5 tanpa polimorfisme:
//Harus membuat list berbeda atau melakukan pengecekan tipe manual (instanceof), membuat kode lebih panjang, sulit dipelihara, dan rawan error.