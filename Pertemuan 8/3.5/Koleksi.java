import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        this.wadah = new ArrayList<>();
        this.nbelm = 0;
    }

    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T value) {
        wadah.set(index, value);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T item) {
        wadah.add(item);
        nbelm++;
    }

    public void delete(int index) {
        wadah.remove(index);
        nbelm--;
    }

    public void showAll() {
        for (T item : wadah) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
