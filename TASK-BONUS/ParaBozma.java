public class ParaBozma {
    public static void main(String[] args) {
        int toplamPara = 278; // Ornek: 278 TL
        
        // Banknot ve madeni para degerleri (buyukten kucuge)
        int[] banknotlar = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println("--- Para Bozma ---");
        System.out.println("Toplam Miktar: " + toplamPara + " TL");
        System.out.print("Bozulan Para: ");
        
        int kalanMiktar = toplamPara;
        boolean ilkBozma = true; // Ilk bozmada "x" onune virgul koymamak icin

        for (int banknotDegeri : banknotlar) {
            // Mevcut banknot degerinden kac tane oldugunu bul
            int adet = kalanMiktar / banknotDegeri;
            
            if (adet > 0) {
                if (!ilkBozma) {
                    System.out.print(", "); // Virgul ekle
                }
                System.out.print(adet + "x" + banknotDegeri);
                kalanMiktar = kalanMiktar % banknotDegeri; // Kalan miktari guncelle
                ilkBozma = false;
            }
        }
        System.out.println(); // Yeni satira gec
    }
}
