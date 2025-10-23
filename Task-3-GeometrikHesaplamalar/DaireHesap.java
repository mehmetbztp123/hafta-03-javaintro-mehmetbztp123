public class DaireHesap {
    public static void main(String[] args) {
        // Yaricap
        double yaricap = 5.5;
        
        // Pi degerini Math.PI ile aliyoruz
        double pi = Math.PI; 
        
        // Alan hesaplama: pi * Math.pow(yaricap, 2)
        // Math.pow(taban, us) us alma islemini yapar.
        double alan = pi * Math.pow(yaricap, 2);
        
        // Cevre hesaplama: 2 * pi * yaricap
        double cevre = 2 * pi * yaricap;
        
        System.out.println("--- Daire Hesaplamalari ---");
        System.out.println("Yaricap: " + yaricap);
        System.out.printf("Alan (Pi*r^2): %.4f%n", alan); // Ciktiyi duzelttim
        System.out.printf("Cevre (2*Pi*r): %.4f%n", cevre); 
    }
}
