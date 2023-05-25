package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        Örnek: Asagidaki kurallara göre kullanicinin girdigi passwordu kontrol ediniz
        1)en ay 8 karakter olsun
        2)Space karakteri olmasin
        3)En az bir büyük harf olsun
        4)En az bir kücük harf olsun
        5)En az bir rakam olsun
        6)En az bir tane @ olsun
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        // 1-En az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println("first? = " + first);

       // 2- Space karakteri icermesin
        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

       //3- En az bir büyük harf olsun
        //biRinci adim: Büyük harf olmayanlari sil
        //ikinci adim: Kalan character sayisina bak
        //character sayisi 0 ise büyük harf yok demektir
        // sifirdan büYük ise büyük harf var demektir

       boolean third= pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("third = " + third);

        //En az bir kücük harf olsun
        boolean fourht = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("fourht = " + fourht);

        //En az bir rakam olsun
        boolean fifth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("fifth = " + fifth);

        //En az bir @ olsun
        boolean sixth = pwd.replaceAll("[^@]" ,"").length()>0;
        System.out.println("sixth = " + sixth);



        System.out.println(("Password gecerli mi?  "+(first && second && third && fourht && fifth && sixth)));







    }
}
