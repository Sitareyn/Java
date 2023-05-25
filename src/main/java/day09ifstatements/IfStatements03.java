package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
//Verilen karakter büyük harf ise ekrana "Büyük Harf" yazdiran kücük harf ise ekrana "Kücük Harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch= input.next().charAt(0);

        //1.Yol)
        if(ch>='A'&& ch<='Z'){
            System.out.println("Büyük Harf");
        }

        if(ch<='a'&& ch>='z'){
            System.out.println("Kücük Harf");
        }
        //2.Yol)
        if(ch>='A'&& ch<='Z'){
            System.out.println("Büyük Harf");
        }else if(ch>='A'&& ch<='Z'){
            System.out.println("Kücük Harf");
        }else{
            System.out.println("Lütfen harf giriniz");
        }
        //if her zaman booleon return eder ve sadece true ise yazdirir ilk buldugu true den sonrasina bak,az


        //java soru bankasi if e kadar cöz







    }
}
