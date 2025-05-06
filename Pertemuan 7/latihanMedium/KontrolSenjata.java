package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");

        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
          System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
    
    public void menusuk(){
        if(senjata.isMenusuk()){
            System.out.println("SWISH");
        }
        else{
            System.out.println("Senjata tidak bisa menusuk");
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}
