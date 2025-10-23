public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.printf("| %-5s | %-5s | %-5s |%n", "a", "a^2", "a^3");
        System.out.println("-------------------------");

        for (int a = 1; a <= 5; a++) {
            // a^2 hesaplama
            int aKare = a * a;
            // a^3 hesaplama
            int aKup = a * a * a; 
            
            // Alternatif: Math.pow(a, 2) ve Math.pow(a, 3) kullanilabilir,
            // ancak int toplama islemi icin carpma daha basittir.

           
            System.out.printf("| %-5d | %-5d | %-5d |%n", a, aKare, aKup);
        }
        System.out.println("-------------------------");
    }
}
