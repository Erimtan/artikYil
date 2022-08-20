import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yil giriniz: ");
        yil = input.nextInt();

        double hesap1 = yil % 100;

        if (hesap1 == 0) {
            double hesap2 = yil % 400;

            if (hesap2 == 0) {
                System.out.println(yil + " bir artik yildir !");
            } else {
                System.out.println(yil + " bir artik yil degildir !");
            }
        } else {
            double hesap3 = yil % 4;

            if (hesap3 == 0) {
                System.out.println(yil + " bir artik yildir !");
            } else {
                System.out.println(yil + " bir artik yil degildir !");
            }
        }
    }
}