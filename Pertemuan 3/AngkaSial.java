/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Patriot Antaras Bangsa / 24060123130100
 * Tanggal   : 5 Maret 2025
 */

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial"); //jika ada eksepsi barisi ini tidak terpanggil
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10); 
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){ //Terpanggil karena ada baris 22 yang masuk ke baris 12 dan kemudian melakukan throw dan catch
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
