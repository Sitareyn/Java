package day15loops;

import java.util.Scanner;

public class Alistirmaa01 {
    public static void main(String[] args) {
        //Kullanicidan bir isim ve soy ismi ayni anda alin ama konsola alt alta yazdirin ve bas harfleri büyük olsun


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi giriniz");

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi giriniz");
        String adSoyad= scan.nextLine();

        char kes = adSoyad.split   (" ")[0].charAt(0);
        char kes2=adSoyad.split(" ")[1].charAt(0);






    }

}