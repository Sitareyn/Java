package day04scannerwrapper;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
       int number = input.nextInt();
         //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bölüp kalani almaliyiz
        //% ==> modulus operator solunda bulunan saayinin saginda bulunan sayiya bolumunden kalani verir
        //dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
        //bir tamsayiyi bir tam sayiya bölerseniz java sonucu kesinlikle tamsayi yapar
        //java bu durumda yuvarlama yapmaz ,ondalik kismi iptal eder
        //dolayisiyla bir tamsayi 10 a bölersek birler basamagini silmis oluruz




        //Son rakami al
        int birlerBasamagi = number%10;
        //sayi kücült
        number= number/10;

        //sondan ikinci rakami al
        int sondanIkinci =number%10;
        //sayi kücült
        number = number/10;

        //Sondan ücüncü rakami al
        int sondanUcuncu =number%10;
        //sayi kücült
        number = number/10;

        //sondan dördüncü rakami al
        int sondanDorduncu =number%10;
        number = number/10;

        //Sondan besinci al
        int sondanBesinci = number%10;
        //Son rakam oldugu icin kücültmeye gerek yok

        System.out.println(sondanBesinci+sondanDorduncu+birlerBasamagi+sondanIkinci);

/*
homework
//1) Kullanicidan aldiigniz üc tane sayinin ortalamasini bulan kodu yaziniz
//ornegin; 3,5,7 ortalamasi icin (3+5+7)/3=5
2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
ornegin ; 3,1,2 icin 3+1+2=6
 */


    }
}
