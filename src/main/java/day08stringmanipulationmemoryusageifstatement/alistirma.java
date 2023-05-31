package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class alistirma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
        double boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu kg cinsinden yaziniz");
        double kilo =scan.nextDouble();

        double bmi = kilo/ (boy*boy);

      //bmi<18.5 ? "zayifsiniz" : bmi<


    }
}
