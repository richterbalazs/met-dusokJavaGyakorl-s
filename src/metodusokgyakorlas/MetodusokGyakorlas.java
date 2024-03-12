package metodusokgyakorlas;

public class MetodusokGyakorlas {
    
    public static void main(String[] args) {
        nehanySzamGyokenekMegjelenitese();
    }

    private static void nehanySzamGyokenekMegjelenitese() {
        otSzamGyoke(); 
        haromSzam();
    }

    private static void otSzamGyoke() {
        int osszeg = szamok(5, szamok(8, 15));
        double a = gyokvonas(osszeg);
        kiir(a, osszeg);
    }

    private static void haromSzam() {
        int osszeg;
        double a;
        osszeg = szamok(10, szamok(14, 12));
        a = gyokvonas(osszeg);
        kiir(a, osszeg);
    }
    
    public static int szamok(int a, int b){
        return b+a;
    }
    
    public static double gyokvonas(double a){
        return Math.sqrt(a);
    }
    
    public static void kiir(double a, int c) {
      System.out.printf("%d gyöke:%.4f",c,a);
    }
    
    public static int osszegzes(int[] tomb) {
        int osszeg = 0;
        for(int i = 0; i < tomb.length; i++)  {
            osszeg += tomb[i];
        }
        return osszeg;
    }
    
}
