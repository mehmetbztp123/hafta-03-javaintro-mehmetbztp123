public class MilKilometreTablosu {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.609;
        
        // Donusum yapilacak mil degerleri
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("------------------------------");
        System.out.printf("| %-10s | %-12s |%n", "Mil", "Kilometre");
        System.out.println("------------------------------");

        for (int mil : milDegerleri) {
            // Kilometre hesaplama
            double kilometre = mil * KM_PER_MILE;
            
            
            System.out.printf("| %-10d | %-12.3f |%n", mil, kilometre);
        }
        System.out.println("------------------------------");
    }
}
