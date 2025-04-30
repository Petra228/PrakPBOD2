public class Main {
    public static void main(String[] args) {
        Anabul[] anabuls = {
            new Kucing("Okayu"),
            new Anjing("Korone"),
            new Burung("Subaru")
        };

        for (Anabul a : anabuls) {
            a.bersuara();
            a.bergerak();
            System.out.println();
        }
    }
}