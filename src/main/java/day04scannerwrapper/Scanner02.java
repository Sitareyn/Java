package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adresinizi giriniz..");

        //nextLine methodu kullanicidan cok kelimeli string almak icin kullanilir
        String adress = input.nextLine();
        System.out.println(adress);

    }


}
