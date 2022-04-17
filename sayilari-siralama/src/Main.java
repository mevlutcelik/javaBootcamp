import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1.Sayıyı giriniz : ");
        a = input.nextInt();

        System.out.print("2.Sayıyı giriniz : ");
        b = input.nextInt();

        System.out.print("3.Sayıyı giriniz : ");
        c = input.nextInt();

        // a'nin en büyük olduğu durum
        if ((a > b) && (a > c)) {
            if ((b > c)) {
                System.out.print("a > b > c");
            } else
                System.out.print("a > c > b");

            // b'nin en büyük olduğu durum
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("b > a > c");
            } else
                System.out.print("b > c > a");

            //c'nin en büyük olduğu durum
        } else {
            System.out.println("c > b > a");
        }


    }

}