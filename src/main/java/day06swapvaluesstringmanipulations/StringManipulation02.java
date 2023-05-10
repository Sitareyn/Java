package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";
        // Ornek1) "s" Stringinin "money" ile bitip bitmedigini kontrol ediniz

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);

        //Örnek2) "s" Stringindeki money kelimesini Dollar kelimesine ceviriniz

       String s1= s.replace("money","dollar");
        System.out.println("s1 = " + s1);

        //Ornek3)
        String s2 = s.replace(" earn","win");
        System.out.println("s2 = " + s2);

        //Örnek 4 tüm a
         String sA = s.replace('a', '*');
        System.out.println("sA = " + sA);
        // Ornek 5) tüm n leri xxx cevir

        String s4 = s.replace("n", "xxx");
        System.out.println("s4 = " + s4);

        // "s" sepetindeE sil

        String s5 = s.replace("e","");
        System.out.println("s5 = " + s5);

        String t = "Ali 13 yasindadir!...";
//Note:Bir grup datayi ifade etmek icin "Regular Expressions" (Regex) kullanir.
        //Note:Bir grup datayi degistirmek icin replaceAll() kullanilir.
        //Note:Regex ifadesinde "^" isareti haric anlamina gelir
        //Ornek 7:"t" String indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz

        /*
                     Meshur Regex ler
           1) Tum rakamlar               ==> [0-9]
           2) Tum kucuk harfler          ==> [a-z]
           3) Tum buyuk harfler          ==> [A-Z]
           4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
           5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
           6) Tum noktalama isaretleri   ==> \\p{Punct}
           7) Tum sesli Harfler          ==> [aeiouAEIOU]
           8) Tum x,q,w harfleri         ==> [xqw]
                     -Olumsuzlari-
           9) Kucuk harflerden farkli tum characterler => [^a-z]
           10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]
         */

        String t1=t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...


    }
}
