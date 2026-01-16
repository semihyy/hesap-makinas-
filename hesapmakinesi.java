import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("2. sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlem seçiniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;

            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;

            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;

            case '/':
                if (sayi2 == 0) {
                    System.out.println("Hata: Bir sayı 0'a bölünemez!");
                } else {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                }
                break;

            default:
                System.out.println("Geçersiz işlem seçtiniz!");
        }

        scanner.close();
    }
}
