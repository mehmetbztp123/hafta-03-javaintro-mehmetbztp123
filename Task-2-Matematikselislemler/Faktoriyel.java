public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        
        long faktoriyel = 1; 
        String islemAdimlari = sayi + "! = "; // Turkce karakter yok
        
        
        for (int i = sayi; i >= 1; i--) {
            faktoriyel = faktoriyel * i; // Faktoriyeli hesapla
            
            // Islem adimlarini olustur
            islemAdimlari += i;
            if (i > 1) {
                islemAdimlari += " x ";
            }
        }
        
        
        System.out.println("--- Faktoriyel Hesaplama ---");
        System.out.println("Islem Adimlari: " + islemAdimlari);
        System.out.println("Sonuc: " + faktoriyel);
    }
}
