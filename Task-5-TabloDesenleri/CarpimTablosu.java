public class CarpimTablosu {
    public static void main(String[] args) {
        int carpim = 2;
        
        System.out.println("--- " + carpim + "'nin Carpim Tablosu ---");
        
        for (int i = 1; i <= 10; i++) {
            int sonuc = carpim * i;
            
            // Ornek cikti: 2 x 1 = 2
            System.out.printf("%d x %d = %d%n", carpim, i, sonuc);
        }
        System.out.println("--------------------------------");
    }
}
