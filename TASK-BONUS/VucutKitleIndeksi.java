public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kiloKg = 70.0;  // Ornek: 70 kilogram
        double boyMetre = 1.75; // Ornek: 1.75 metre (175 cm)
        
        // BMI hesaplama
        double bmi = kiloKg / (boyMetre * boyMetre);
        
        System.out.println("--- Vucut Kitle Indeksi (BMI) Hesaplama ---");
        System.out.println("Kilo (kg): " + kiloKg);
        System.out.println("Boy (m): " + boyMetre);
        System.out.printf("BMI Degeriniz: %.2f%n", bmi); // Sonucu 2 ondalik basamakla yazdir
        
        // BMI Kategorileri (istege bagli eklenebilir)
        System.out.print("BMI Kategorisi: ");
        if (bmi < 18.5) {
            System.out.println("Zayif");
        } else if (bmi < 24.9) {
            System.out.println("Normal Kilo");
        } else if (bmi < 29.9) {
            System.out.println("Fazla Kilolu");
        } else {
            System.out.println("Obez");
        }
    }
}
