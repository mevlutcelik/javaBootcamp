import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım
        double weight,height,s;

        // Scanner nesnesini çağıralım
        Scanner input = new Scanner(System.in);

        // Başlık ekleyelim
        System.out.println("##############################");
        System.out.println("### BEDEN KİTLE İNDEKSİ ###");

        // Kullanıcıdan verileri alalım
        System.out.print("Boyunuzu metre cinsinden yazın: ");
        height = input.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden yazın: ");
        weight = input.nextDouble();

        // Hesaplayalım
        s = weight / (height * height);

        // Yazdıralım
        System.out.println("##############################");
        System.out.print("Beden kitle indeksiniz: " + s);
    }
}
