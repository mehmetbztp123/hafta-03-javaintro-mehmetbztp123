public class IsimKarti {
    public static void main(String[] args) {
        // Degiskenlerinizi tanimlayin
        String ad = "ALI";
        String soyad = "YILMAZ";
        String ogrenciNo = "2024123456";
        String bolum = "Yazilim Muhendisligi";
        
        System.out.println("---------------------------------------");
        System.out.println("|             OGRENCI KARTI           |");
        System.out.println("---------------------------------------");
        System.out.printf("| %-15s: %-20s |%n", "AD", ad);
        System.out.printf("| %-15s: %-20s |%n", "SOYAD", soyad);
        System.out.printf("| %-15s: %-20s |%n", "OGRENCI NO", ogrenciNo);
        System.out.printf("| %-15s: %-20s |%n", "BOLUM", bolum);
        System.out.println("---------------------------------------");

        // Not: printf kullanimi ile sabit genislikte formatli cikti elde edildi.
    }
}
