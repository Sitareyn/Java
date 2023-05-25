package day07stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i

           8)Kucuk harfler disindaki tum characterler ==>[^a-z]
           9)Tum harflerin disindaki tum characterler ==>  [^a-zA-Z]
           10)sadece space karakteri ==> \\s  ==>(kücük)
           11)sadece space karakteri haric ==> \\S ==>(büyük)
           12)sadece rakamlar ==> \\d
           13)sadece rakamlar haric ==> \\D

         */
        //
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        //ÖRNEK2) t stringindeki tüm rakamlari ve harfleri "!" e ceviriniz

        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

       // tüm sesli harfleri ? cevir

        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println("t3 = " + t3);

        // kücük harfler disindaki tüm kararketler

        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println("t4 = " + t4);

        //t stringindeki tüm harfler disindaki tüm karakterleri + cevir

        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println("t5 = " + t5);

        //Ornak6  spaceler disindaki tüm kararkterleri ? cevir

        String t6 = t.replaceAll("[^ ]","?");
        System.out.println("t6 = " + t6);

        //ornek7  t stringindeki sesli harfler disindaki tüm karakterleri & cevir

        String t7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t7 = " + t7);

    }
}