public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;

    public BangunDatarGenerik(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}
