public class HesapOzeti {
    public static void main(String[] args) {
        // Urun, miktar ve fiyat bilgileri
        String urun1 = "Ekmek";
        double miktar1 = 2;
        double fiyat1 = 8.50;

        String urun2 = "Sut (1lt)";
        double miktar2 = 3;
        double fiyat2 = 25.00;
        
        String urun3 = "Peynir";
        double miktar3 = 0.5; // Yarim kg
        double fiyat3 = 90.00;

        // Ara Toplamlar
        double araToplam1 = miktar1 * fiyat1;
        double araToplam2 = miktar2 * fiyat2;
        double araToplam3 = miktar3 * fiyat3;
        
        // Genel Toplam
        double genelToplam = araToplam1 + araToplam2 + araToplam3;

        System.out.println("----------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-10s | %-12s |%n", "Urun", "Miktar", "Birim Fiyat", "Ara Toplam");
        System.out.println("----------------------------------------------------------");
        
        // Urun 1
        System.out.printf("| %-15s | %-10.2f | %-10.2f | %-12.2f |%n", urun1, miktar1, fiyat1, araToplam1);
        
        // Urun 2
        System.out.printf("| %-15s | %-10.2f | %-10.2f | %-12.2f |%n", urun2, miktar2, fiyat2, araToplam2);
        
        // Urun 3
        System.out.printf("| %-15s | %-10.2f | %-10.2f | %-12.2f |%n", urun3, miktar3, fiyat3, araToplam3);

        System.out.println("----------------------------------------------------------");
        // Genel Toplam
        System.out.printf("| %-39s | %-12.2f |%n", "GENEL TOPLAM", genelToplam);
        System.out.println("----------------------------------------------------------");
    }
}
