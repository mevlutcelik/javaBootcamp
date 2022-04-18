import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int distance, age, type ;
        double tutar = 0 ;
        System.out.print("Gideceginiz mesafeyi \"km\" cinsinden giriniz : ");
        distance = input.nextInt();
        if (distance <= 0) System.out.println("Hatali Giris Yaptiniz.");
        tutar += (distance * 0.1);
        System.out.println("Indirimsiz bilet fiyati : " + (distance * 0.1) + "TL");
        System.out.print("Yasinizi Giriniz : ");
        age = input.nextInt();
        if (age < 0) {
            System.out.println("Hatalı giris yaptiniz.");
        }else if (age >= 0 && age <12) {
            tutar -= (tutar/2);
            System.out.println("Yas indirimi sonucu tutar : " + (tutar) + "TL");
        }else if (age >= 12 && age < 24){
            tutar -= (tutar/10);
            System.out.println("Yas indirimi sonucu tutar : " + (tutar) + "TL");
        } else if (age > 65) {
            tutar -= (tutar * 3 / 10);
            System.out.println("Yas indirimi sonucu tutar : " + (tutar) + "TL");
        }
        System.out.print("Bilet Turunuzu Seciniz \n1 : Tek Yon\t\t2: Gidis-Donus ");
        type = input.nextInt();
        switch (type ){
            case 1 :
                System.out.println("Bilet turune gore bir indirim uygulanmadi.");
                break;
            case 2 :
                tutar -= (tutar * 2 / 10);
                tutar *= 2;
                System.out.println("Bilet turune gore indirim sonucu tutar : " + tutar + "TL");
                break;
            default :
                System.out.println("Hatali Giris Yaptiniz.");
                break;

        }
        System.out.println("Odenecek tutar : " + tutar + "TL");
    }
}
