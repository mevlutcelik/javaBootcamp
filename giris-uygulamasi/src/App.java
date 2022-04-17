import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Değişkenleri tanımlayalım
        String uName, pass, islem, newPass;

        // Scanner nesnesini projeye dahil edelim
        Scanner input = new Scanner(System.in);

        // Başlığımızı yazalım
        System.out.println("### GİRİŞ UYGULAMASI ###");

        // Kullanıcıdan verileri alalım
        System.out.print("Kullanıcı adınız: ");
        uName = input.nextLine();
        System.out.print("Şifreniz: ");
        pass = input.nextLine();

        // Verilerin boş olmadığını kontrol edelim
        if (uName == "" || pass == "") {
            System.out.print("Lütfen boş bırakmayın!");
        } else {
            // Şifreyi kontrol edelim (Varsayılan olarak şifreyi 1234 kabul ettik)
            if (!pass.equals("1234")) {
                System.out.print("Şifrenizi sıfırlamak ister misiniz? [evet (e) / hayır (h)]: ");
                islem = input.nextLine();
                switch(islem){
                    case "e":
                    case "E":
                    case "evet":
                    case "Evet":
                    case "EVET":
                    System.out.print("Lütfen oluşturmak istediğiniz şifreyi giriniz: ");
                    newPass = input.nextLine();
                    System.out.print(newPass.equals("1234") ? "Şifreniz önceki şifre ile aynı olamaz!\nLütfen başka bir tane giriniz." : "Şifreniz oluşturuldu.");
                    break;
                    case "h":
                    case "H":
                    case "hayır":
                    case "Hayır":
                    case "HAYIR":
                    System.out.print("Şifreniz aynı kaldı.");
                    break;
                }
            } else {
                System.out.print("Giriş yaptınız. Hoşgeldin, " + uName);
            }
        }
    }
}
