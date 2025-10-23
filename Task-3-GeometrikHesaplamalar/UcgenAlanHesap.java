public class UcgenAlanHesap {
    public static void main(String[] args) {
        // Kenar uzunluklari
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        
        // 1. Adim: Yari cevre (s) hesaplama
        double s = (a + b + c) / 2;
        
        // 2. Adim: Heron Formulu ile Alan hesaplama
        double alanKareIci = s * (s - a) * (s - b) * (s - c);
        double alan = Math.sqrt(alanKareIci);
        
        System.out.println("--- Ucgen Alani (Heron) ---");
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yari Cevre (s): " + s);
        System.out.println("Alan: " + alan); 
    }
}
