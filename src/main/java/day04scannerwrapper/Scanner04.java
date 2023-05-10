package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunluklarini aliniz
        //a)Alanini hesaplayiniz ==> kisakenar*uzunkenar
        //b)Cevresini hesablayiniz==>2*kisa kenar + 2*uzun kenar
         Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kisa kenar uzunlugunu giriniz");
        double shortSide = input.nextDouble();
        System.out.println("Dikdörtgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println("Alan = "+ (shortSide*longSide));
        System.out.println("Cevre = "+ (2*shortSide+2*longSide));

    }




}
