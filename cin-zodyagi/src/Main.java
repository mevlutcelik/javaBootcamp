import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Dogum Yilinizi Giriniz : ");
        yil = input.nextInt();

        if (yil % 12 == 0 ) {
            System.out.print("Cin Zodyagi Burcunuz : Maymun");
        }else if (yil % 12 == 1) {
            System.out.print("Cin Zodyagi Burcunuz : Horoz ");

        }else if (yil % 12 == 2) {
            System.out.print("Cin Zodyagi Burcunuz : Köpek ");

        }else if (yil % 12 == 3) {
            System.out.print("Cin Zodyagi Burcunuz : Domuz ");

        }else if (yil % 12 == 4) {
            System.out.print("Cin Zodyagi Burcunuz : Fare ");

        }else if (yil % 12 == 5) {
            System.out.print("Cin Zodyagi Burcunuz : Öküz ");

        }else if (yil % 12 == 6) {
            System.out.print("Cin Zodyagi Burcunuz : Kaplan ");

        }else if (yil % 12 == 7) {
            System.out.print("Cin Zodyagi Burcunuz : Tavşan ");

        }else if (yil % 12 == 8) {
            System.out.print("Cin Zodyagi Burcunuz : Ejderha ");

        }else if (yil % 12 == 9) {
            System.out.print("Cin Zodyagi Burcunuz : Yılan ");

        }else if (yil % 12 == 10) {
            System.out.print("Cin Zodyagi Burcunuz : At ");

        }else if (yil % 12 == 11) {
            System.out.print("Cin Zodyagi Burcunuz : koyun ");
        }
    }
}