import java.util.Scanner;

public class mukSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int toplam = 0, sayi = 1;

        System.out.print("bir sayı giriniz:");
        sayi = inp.nextInt();

            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (sayi == toplam) {
                System.out.println(sayi + "mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + "mükemmel sayı değildir.");
            }
        }
    }
}
