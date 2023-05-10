package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan iki sayi alio 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");
        double firstNummer = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNummer+secondNumber);
        System.out.println(firstNummer-secondNumber);
        System.out.println(firstNummer*secondNumber);
        System.out.println(firstNummer/secondNumber);



    }
}
