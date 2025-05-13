public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();

        koleksiAnabul.add(new Kucing("Cipher"));
        koleksiAnabul.add(new Kucing("Okayu"));
        koleksiAnabul.add(new Anjing("Korone"));
        koleksiAnabul.add(new Kucing("Ju Fufu"));
        koleksiAnabul.add(new Burung("Kiara"));
        koleksiAnabul.add(new Burung("Reine"));
        koleksiAnabul.add(new Anjing("Fuwawa"));
        koleksiAnabul.add(new Anjing("Mococo"));
        koleksiAnabul.add(new Burung("Subaru"));
        koleksiAnabul.add(new Burung("Mumei"));

        System.out.println("=== Koleksi Anabul ===");
        koleksiAnabul.showAll();
    }
}
