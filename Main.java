import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double kArmut, kElma, kDomates, kMuz, kPatlican, toplam;
        double cArmut, cElma, cDomates, cMuz, cPatlican;

        System.out.print("Lütfen kaç kilogram armut almak istediğinizi yazınız: ");
        Scanner armutSc = new Scanner(System.in);
        kArmut = armutSc.nextDouble();

        System.out.print("Lütfen kaç kilogram elma almak istediğinizi yazınız: ");
        Scanner elmaSc = new Scanner(System.in);
        kElma = elmaSc.nextDouble();

        System.out.print("Lütfen kaç kilogram domates almak istediğinizi yazınız: ");
        Scanner domatesSc = new Scanner(System.in);
        kDomates = domatesSc.nextDouble();

        System.out.print("Lütfen kaç kilogram muz almak istediğinizi yazınız: ");
        Scanner muzSc = new Scanner(System.in);
        kMuz = muzSc.nextDouble();

        System.out.print("Lütfen kaç kilogram patlican almak istediğinizi yazınız: ");
        Scanner patlicanSc = new Scanner(System.in);
        kPatlican = patlicanSc.nextDouble();

        cArmut = armut * kArmut;
        cElma = elma * kElma;
        cDomates = domates * kDomates;
        cMuz = muz * kMuz;
        cPatlican = patlican * kPatlican;
        toplam = cArmut + cElma + cDomates + cMuz + cPatlican ;
        System.out.println("Toplam tutar: " + toplam + "TL");
    }
}