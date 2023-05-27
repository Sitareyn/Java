package day04scannerwrapper;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        //Kullanicidan 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran
        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bölüp kalani almaliyiz
        //% ==> modulus operator solunda bulunan saayinin saginda bulunan sayiya bolumunden kalani verir
        //dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
        //bir tamsayiyi bir tam sayiya bölerseniz java sonucu kesinlikle tamsayi yapar
        //java bu durumda yuvarlama yapmaz ,ondalik kismi iptal eder
        //dolayisiyla bir tamsayi 10 a bölersek birler basamagini silmis oluruz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 5 basamakli bir tamsayi giriniz");

        int sayi = input.nextInt();

        int birler =sayi%10;          // int birlerBasamagi = number%10;
                                                    //sayi kücült
         sayi= sayi/10;                 //number= number/10;

        int onlar =sayi%10;
        sayi= sayi/10;

        int yüzler = sayi%10;
        sayi=sayi/10;

        int binler = sayi%10;
        sayi=sayi/10;

        int onbinler= sayi%10;
        sayi=sayi/10;

        System.out.println(birler+onlar+binler+onbinler);






    }
}
