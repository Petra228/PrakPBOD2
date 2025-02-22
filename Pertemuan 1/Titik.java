/* Nama File    : Titik.java
 * Deskripsi    : atribut dan method class titik
 * Pembuat      : Patriot Antaras Bangsa / 24060123130100
 * Tanggal      : 19 Februari 2025
 */

public class Titik {
    /***************ATRIBUT***************/
    double absis, ordinat;
    static int  counterTitik = 0;

    /***************METHOD****************/

    //KONSTRUKTOR
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //SELEKTOR
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    static int getCounterTitik(){
        return counterTitik;
    }
    
    //MUTATOR
    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double y){
        ordinat = y;
    }
    
    //LAINNYA
    void geser(double x,double y){
        absis += x;
        ordinat += y;
    }
    
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt((Math.pow(absis - T.getAbsis(), 2)) + (Math.pow(ordinat - T.getOrdinat(), 2)));
    }

    void refleksiX(){
        ordinat *= -1;
    }

    void refleksiY(){
        absis *= -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis, ordinat*-1);
    }

    Titik getRefleksiY(){
        return new Titik(absis*-1, ordinat);
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}