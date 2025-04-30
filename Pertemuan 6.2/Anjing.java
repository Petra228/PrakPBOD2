class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara seperti guk-guk");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}
