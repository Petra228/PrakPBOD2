public class Main {
    public static void main(String[] args) {
        BangunDatarGenerik<Persegi> bd1 = new BangunDatarGenerik<>(new Persegi(6));
        BangunDatarGenerik<PersegiPanjang> bd2 = new BangunDatarGenerik<>(new PersegiPanjang(3, 7));
        BangunDatarGenerik<Segitiga> bd3 = new BangunDatarGenerik<>(new Segitiga(6, 3, 5, 4, 6));

        System.out.println("Luas Persegi: " + bd1.hitungLuas());
        System.out.println("Keliling Persegi: " + bd1.hitungKeliling());

        System.out.println("Luas Persegi Panjang: " + bd2.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + bd2.hitungKeliling());

        System.out.println("Luas Segitiga: " + bd3.hitungLuas());
        System.out.println("Keliling Segitiga: " + bd3.hitungKeliling());
    }
}
