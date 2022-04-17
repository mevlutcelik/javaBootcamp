import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int islem, n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.println("### HESAP MAKINESI ###");
        System.out.println("Hesap makinesi uygulamasina hosgelniz. Lutfen yapmak istediginiz islemi seciniz.\n1. Toplama\t\t2. Cikarma\n3. Carpma\t\t4. Bolme");
        System.out.print("Sectiginiz islemi yaziniz: ");
        islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.println("Toplama islemini tercih ettiniz.");
                System.out.print("Ilk sayiyi giriniz: ");
                n1 = input.nextInt();
                System.out.print("Ikinci sayiyi giriniz: ");
                n2 = input.nextInt();
                System.out.print("Toplama islemi sonucunuz: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma islemini tercih ettiniz.");
                System.out.print("Ilk sayiyi giriniz: ");
                n1 = input.nextInt();
                System.out.print("Ikinci sayiyi giriniz: ");
                n2 = input.nextInt();
                System.out.print("Cikarma islemi sonucunuz: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma islemini tercih ettiniz.");
                System.out.print("Ilk sayiyi giriniz: ");
                n1 = input.nextInt();
                System.out.print("Ikinci sayiyi giriniz: ");
                n2 = input.nextInt();
                System.out.print("Carpma islemi sonucunuz: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bolme islemini tercih ettiniz.");
                System.out.print("Ilk sayiyi giriniz: ");
                n1 = input.nextInt();
                System.out.print("Ikinci sayiyi giriniz: ");
                n2 = input.nextInt();
                System.out.print(n2 == 0 ? "Tanimsiz" : "Bolme islemi sonucunuz: " + (n1 / n2));
                break;
            default:
                System.out.print("Hatalı bir işlem seçtiniz!");
                break;
        }
    }
}
