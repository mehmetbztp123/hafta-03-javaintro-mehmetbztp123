public class DikdortgenHesap {
    public static void main(String[] args) {
        double en = 4.5;
        double boy = 7.9;
        
        // Alan hesaplama
        double alan = en * boy;
        
        // Cevre hesaplama
        double cevre = 2 * (en + boy);
        
        System.out.println("--- Dikdortgen Hesaplamalari ---");
        System.out.println("En: " + en + ", Boy: " + boy);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
