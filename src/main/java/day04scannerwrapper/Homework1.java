package day04scannerwrapper;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

//1) Kullanicidan aldiigniz üc tane sayinin ortalamasini bulan kodu yaziniz
//ornegin; 3,5,7 ortalamasi icin (3+5+7)/3=5

        Scanner input = new Scanner(System.in);
        String kullaniciAdi;
        System.out.println("kullanici adinizi giriniiz");
        kullaniciAdi=input.next();

        String kullaniciSoyadi;
        System.out.println("kullanici soyadinizi girirniz");
        kullaniciSoyadi=input.next();

        int sayi1;
        int sayi2;
        int sayi3;
        int sonuc;
        System.out.println("Ilk sayiyi giriniz");
        sayi1 = input.nextInt();
        System.out.println("Ikinci sayiyi girirniz");
        sayi2 =input.nextInt();
        System.out.println("Ücüncü sayiyi giriniz");
        sayi3=input.nextInt();
        sonuc= (sayi1+sayi2+sayi3)/3;
        System.out.println("Ortalamaniz= "+sonuc);





    }
}
