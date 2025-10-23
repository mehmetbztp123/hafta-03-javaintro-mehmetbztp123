public class IkiIslem {
    public static void main(String[] args) {
        
        double pay = (9.5 * 4.5) - (2.5 * 3);
        double payda = 45.5 - 3.5;
        
        double sonuc = pay / payda;
        
        System.out.println("Pay: " + pay);
        System.out.println("Payda: " + payda);
        System.out.println("Sonuc: " + sonuc);

        
        String formatliSonuc = String.format("%.4f", sonuc);
        
        System.out.println("\n4 ondalik basamakli sonuc:");
        System.out.println(formatliSonuc);
    }
}
