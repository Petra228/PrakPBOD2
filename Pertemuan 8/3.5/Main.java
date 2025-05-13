public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        // Add & showAll
        for (char c = 'A'; c <= 'J'; c++) {
            koleksiKarakter.add(c);
        }
        System.out.println("Isi koleksi setelah penambahan:");
        koleksiKarakter.showAll();

        // SetIsi & showAll
        koleksiKarakter.setIsi(0, 'Z');
        System.out.println("\nIsi koleksi setelah setIsi(0, 'Z'):");
        koleksiKarakter.showAll();

        // getIsi
        System.out.println("\nElemen pada indeks 0: " + koleksiKarakter.getIsi(0));

        // getSize
        System.out.println("Ukuran koleksi: " + koleksiKarakter.getSize());

        // delete & showAll
        koleksiKarakter.delete(5);
        System.out.println("\nIsi koleksi setelah delete indeks 5:");
        koleksiKarakter.showAll();
    }
}
