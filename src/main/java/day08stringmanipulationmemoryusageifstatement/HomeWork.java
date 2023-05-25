package day08stringmanipulationmemoryusageifstatement;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class HomeWork {

    //Bir String variable olusturunuz ve bu stringdeki rakam olmayan karakterlerin sayisini konsola yazdiriniz
    //Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri konsolda buyuk harfle yazdiriniz,
    //Bir String variable olusturunuz ve bu Stringdeki ilk ve son karakterlerin ascii degerlerini konsola yazdiriniz
    //Tek kelimeli bir sehir ismi icin bir variable olusturun ve sehir isminin ilk harfini Buyuk harf ile diger harflerini kucuk harflerle yazidrniz.
    //Asagidaki kurallara gore kullanicinin girinigi password u kontrol ediniz
    //a) en az 6 karakter olsun
    //b)en az bir tane buyuk harf icersin
    //c) en az bir tane kucuk harf olsun
    //d) en az bir tane rakam olsun
    //NOTE1) Önce canli oturum sirasinda cözülen örnekleri yapiniz
    //NOTE2) Tum sorulari dinamik kodlarla cozulmelidir

    public static void main(String[] args) {
  //1)Bir String variable olusturunuz ve bu stringdeki rakam olmayan karakterlerin sayisini konsola yazdiriniz
        String kahve = "Bir kahve ki 40 yil hatri olan?";

        int K1 = kahve.replaceAll("[0-9]","").length();
        System.out.println("K1 = " + K1);

  //2)Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri konsolda buyuk harfle yazdiriniz,
      String s= "Günes topla benim icin";
      String s1=s.substring(0,1).toLowerCase()+s.substring(1,s.length()-1).toUpperCase()+s.substring(s.length()-1).toLowerCase();
        System.out.println("s1 = " + s1);

  //Bir String variable olusturunuz ve bu Stringdeki ilk ve son karakterlerin ascii degerlerini konsola yazdiriniz.
        String cahit ="Ucmayi ögrenemeden göcmeye mecbur kalmis bir kus gibi kalbimiz";
        int sor = cahit.charAt(0);
        int sor1= cahit.charAt(cahit.length()-1);
        System.out.println("sor = " + sor);
        System.out.println("sor1 = " + sor1);


//Tek kelimeli bir sehir ismi icin bir variable olusturun ve sehir isminin ilk harfini Buyuk harf ile diger harflerini kucuk harflerle yazidrniz.

     String güzelSehrim = "IZMIR";

     String GsI= güzelSehrim.substring(0,1).toUpperCase()+güzelSehrim.substring(1,5).toLowerCase();
        System.out.println("GsI = " + GsI);

// //Asagidaki kurallara gore kullanicinin girinigi password u kontrol ediniz
//    //a) en az 6 karakter olsun
//    //b)en az bir tane buyuk harf icersin
//    //c) en az bir tane kucuk harf olsun
//    //d) en az bir tane rakam olsun

       Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Password giriniz");
        String pwd = input.nextLine();

        boolean erste =pwd.length()>5;
        System.out.println("erste = " + erste);
        boolean zweite = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("zweite = " + zweite);
        boolean dritte = pwd.replaceAll("[a-z]","").length()>0;
        System.out.println("dritte = " + dritte);
        boolean vierte = pwd.replaceAll("[0-9]","").length()>0;
        System.out.println("vierte = " + vierte);

        System.out.println(("Password gecerli mi= "+(erste&&zweite&&dritte&&vierte)));









    }


}
