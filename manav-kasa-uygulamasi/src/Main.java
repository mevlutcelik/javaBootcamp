import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // Değişkenleri tanımlayalım
        int kgArmut, kgElma, kgDomates, kgMuz, kgPatlıcan;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5, toplam;

        // Scanner nesnesini çağıralım
        Scanner input = new Scanner(System.in);

        // Başlık ekleyelim
        System.out.println("#########################");
        System.out.println("### MANAV KASA PROGRAMI ###");

        // Kullanıcıdan verileri alalım
        System.out.print("Kaç kilo armut almak istersin: ");
        kgArmut = input.nextInt();
        System.out.print("Kaç kilo elma almak istersin: ");
        kgElma = input.nextInt();
        System.out.print("Kaç kilo domates almak istersin: ");
        kgDomates = input.nextInt();
        System.out.print("Kaç kilo muz almak istersin: ");
        kgMuz = input.nextInt();
        System.out.print("Kaç kilo patlıcan almak istersin: ");
        kgPatlıcan = input.nextInt();

        // Toplam tutar
        toplam = (kgArmut * armut) + (kgElma * elma) + (kgDomates * domates) + (kgMuz * muz) + (kgPatlıcan * patlıcan);

        // Toplamı ekrana yazdıralım
        System.out.println("#########################");
        System.out.print("Toplam ücret: " + toplam + "TL");
    }
}