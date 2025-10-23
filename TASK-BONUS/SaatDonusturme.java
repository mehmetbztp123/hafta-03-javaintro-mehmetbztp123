public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665; // Ornek saniye degeri
        
        // Saati hesaplama: Toplam saniyeyi 3600'e (1 saatteki saniye) bol
        int saat = toplamSaniye / 3600;
        
        // Kalan saniyeleri bulma: Toplam saniyenin 3600'e bolumunden kalan
        int kalanSaniye = toplamSaniye % 3600;
        
        // Dakikayi hesaplama: Kalan saniyeleri 60'a (1 dakikadaki saniye) bol
        int dakika = kalanSaniye / 60;
        
        // Son saniyeleri bulma: Kalan saniyelerin 60'a bolumunden kalan
        int saniye = kalanSaniye % 60;
        
        System.out.println("--- Saniye Donusturme ---");
        System.out.println("Toplam Saniye: " + toplamSaniye);
        // printf ile 0 basamagini otomatik eklemek icin %02d kullanilir
        System.out.printf("Donusturulen Zaman: %02d:%02d:%02d%n", saat, dakika, saniye);
    }
}
