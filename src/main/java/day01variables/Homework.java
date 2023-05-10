package day01variables;

import java.util.concurrent.Callable;

public class Homework {
    public static void main(String[] args) {
        //ödev1-Üc farkli data türünde variable olursturun ve bunlari konsola yazdirin.

         String Meslek = "Doktor";
         int yas = 29;
         double siralama = 3.200;

        System.out.println("Meslek = " + Meslek);
        System.out.println("yas = " + yas);
        System.out.println("siralama = " + siralama);
     //Ödev2-ülke ve sehir isimleri icin iki variable olusturup bunlari konsola yazdirin

        String ülke = "Türkiye";
        String sehir = "Izmir";

        System.out.println("ülke = " + ülke);
        System.out.println("sehir = " + sehir);

        String ülke2 = "Avusturya";
        String sehir2= "Wien";

        System.out.println("ülke2 = " + ülke2);
        System.out.println("sehir2 = " + sehir2);

        //Ödev3-iki tam sayi türünde variable yazdirin ve bunlari toplayin

        int sonuc = ToplamaYap(5,9);
        System.out.println("sonuc = " + sonuc);

        int sayi1 = 32;
        int sayi2 = 105;
        System.out.println(sayi1+sayi2);

        int Sonucu = CarpmaYap (7,5);
        System.out.println("7 ve 5 in Carpma isleminin sonucu: " + Sonucu);

        /* classin icinde olusturdugun methoda hangi ismi verdiysen, main methota
        ayni isim ile cagirdiginda asagidaki islemi main de calistirmak icin hazzirlamis olursun
         */

    }

    public static int ToplamaYap (int a , int b ) {
        return a+b;
    }
    public static int CarpmaYap (int c , int d) {return c*d;}





};
