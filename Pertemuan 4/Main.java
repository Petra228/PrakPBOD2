public class Main{
    public static void main(String[] args) {
        Date D1 = new Date(5,1,1990);
        Date D2 = new Date(6,4,2005);
        DosenTetap DT1 = new DosenTetap("123", "Anaxagoras", D1, D2, 100000, "321", "Fakultas Sains dan Matematika");
        DT1.printInfo();

        System.err.println("");

        Date D3 = new Date(20,8,1991);
        Date D4 = new Date(21,3,2004);
        Date D5 = new Date(21,7,2031);
        DosenTamu DT2 = new DosenTamu("111", "Faruzan", D3, D4, 80000, "222", "Fakultas Ilmu Budaya", D5);
        DT2.printInfo();

        System.err.println("");

        Date D6 = new Date(20,2,1990);
        Date D7 = new Date(2,1,2002);
        TenagaPendidikan TP = new TenagaPendidikan("000", "Anby Demara", D6, D7, 120000, "Sumber Daya");
        TP.printInfo();
    }
}