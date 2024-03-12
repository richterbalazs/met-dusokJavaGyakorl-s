package metodusokgyakorlas;

public class MetodusBetukkel {
    public static void main(String[] args) {
        tombokMegjelenitese();
    }
    
    private static void tombokMegjelenitese(){
        char[] betuk = betukGeneralasa(9);
        kiirasok(betuk);
    }
    
    private static void kiirasok(char[] tomb){
        sorbaKiir(tomb);
        matrixbaKiir(tomb);
    }
    
    private static char[] betukGeneralasa(int b){
        char[] tomb = new char [b];
        for (int i = 0; i < 9; i++) {
            tomb[i] = (char) (97+i);
        }
        return tomb;
    }
    
    private static void sorbaKiir(char[] tomb){
        for(int i = 0; i < tomb.length; i++){
            System.out.print(tomb[i] + " ");
        }
    }
  
    public static void matrixbaKiir(char[] tomb) {
        for(int i = 0; i < tomb.length; i++){
            if(i % 3 == 0){
                System.out.println("");
            }
            System.out.print(tomb[i] + " ");
        }
    }
    
    private static void fajlbaKiiras(char[] tomb) {
        
    }
    
}
