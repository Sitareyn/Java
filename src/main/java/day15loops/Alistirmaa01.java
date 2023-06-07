package day15loops;

import java.util.Locale;
import java.util.Scanner;

public class Alistirmaa01 {
    public static void main(String[] args) {
        //Kullanicidan bir isim ve soy ismi ayni anda alin ama konsola alt alta yazdirin ve bas harfleri büyük olsun


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi giriniz");

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi giriniz");
        String adSoyad= scan.nextLine().toLowerCase();

        char kes = adSoyad.split   (" ")[0].toUpperCase().charAt(0);
        char kes2=adSoyad.split(" ")[1].toLowerCase().charAt(0);

        System.out.println(kes);
        System.out.println(kes2);







    }

}