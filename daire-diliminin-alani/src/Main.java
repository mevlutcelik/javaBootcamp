import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        /* Değişkenleri tanımlayalım.
        r   :   Yarıçap
        a   :   Merkes açının ölçüsü
        */
        int r,a;
        double PI = 3.14, s;

        // Scanner nesnemizi çağıralım
        Scanner input = new Scanner(System.in);

        // Başlık yazalım
        System.out.println("###########################");
        System.out.println("### DAİRE DİLİMİNİN ALANINI HESAPLAYAN PROGRAM ###");

        // Kullanıcıdan verileri çağıralım
        System.out.print("Yarıçapı girin: ");
        r = input.nextInt();
        System.out.print("Merkez açının ölçüsünü girin: ");
        a = input.nextInt();

        // Hesaplama yapalım
        s = (PI * (r * r) * a) / 360;

        // Ekrana yazalım
        System.out.println("###########################");
        System.out.print("Daire diliminin alanı: " + s);
    }
}
