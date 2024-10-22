import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan iki sayı al
        System.out.print("Birinci sayıyı girin: ");
        int a = scanner.nextInt();
        
        System.out.print("İkinci sayıyı girin: ");
        int b = scanner.nextInt();
        
        // Küçük sayıyı bul
        int küçükSayı = a < b ? a : b;
        
        int ebob = 1; // Başlangıçta EBOB'u 1 olarak ayarla
        
        // EBOB'u bul
        for (int i = küçükSayı; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
                break; // EBOB'u bulduk, döngüden çık
            }
        }
        
        // EKOK hesapla
        int ekok = (a * b) / ebob;
        
        // Sonuçları yazdır
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
