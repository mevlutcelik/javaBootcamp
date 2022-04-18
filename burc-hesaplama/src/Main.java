import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Scanner nesnesini dahil edelim
        Scanner input = new Scanner(System.in);

        // Değişkenleri tanımlayalım
        int month, day;
        String burc = "";

        // Başlık ekleyelim
        System.out.println("### BURC HESAPLAMA ###");

        // Kullanıcıdan verileri alalım
        System.out.print("Dogdugunuz ay (sayi olarak): ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gun (sayi olarak): ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    burc = "Oglak burcu";
                } else
                    burc = "Kova burcu ";
        }


        if (month == 2) {
            if (day >= 1 && day <= 28)
                if (day < 20) {
                    burc = "Kova burcu";
                } else
                    burc = "Balik burcu ";
        }

        if (month == 3) {
            if (day >= 1 && day <= 31)
                if (day < 21) {
                    burc = "Balik burcu";
                } else burc = "Koc burcu ";
        }

        if (month == 4) {
            if (day >= 1 && day <= 30)
                if (day < 21) {
                    burc = "Koc burcu";
                } else burc = "Boga burcu ";
        }

        if (month == 5) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    burc = "Boga burcu";
                } else burc = "Ikizler burcu ";
        }

        if (month == 6) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    burc = "Ikizler burcu";
                } else burc = "Yengec burcu ";
        }

        if (month == 7) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                    burc = "Yengec burcu";
                } else burc = "Aslan burcu ";
        }

        if (month == 8) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    burc = "Aslan burcu";
                } else burc = "Basak burcu ";
        }

        if (month == 9) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                    burc = "Basak burcu";
                } else burc = "Terazi burcu ";
        }

        if (month == 10) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                    burc = "Terazi burcu";
                } else burc = "Akrep burcu ";
        }

        if (month == 11) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    burc = "Akrep burcu";
                } else burc = "Yay burcu ";
        }

        if (month == 12) {
            if (day >= 1 && day <= 30)
                if (day < 22) {
                    burc = "Yay burcu";
                } else burc = "Kova burcu ";
        }

        // Ekrana yazdıralım
        System.out.print("Burcunuz : " + burc);

    }
}
