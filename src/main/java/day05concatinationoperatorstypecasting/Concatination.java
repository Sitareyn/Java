package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Ornek1; Bir string ve iki integar variable olusturun.
        //Stringdegeri ile integer larin toplamini konsola yazdirin

        String s = "Elma";
        int a = 10;
        int b = 11;
        System.out.println(s+a+b); // elma1011

        System.out.println(s+(a+b)); //elma21
        System.out.println(s+a*b); //elma110
        System.out.println(a+b+s); //21elma
        System.out.println(a+s+b); //10elma11

        //Java da (+) sembolu iki sayi arasinda kullanilirsa toplama islemi olur
        //Java da (+) sembolu iki String arasinda veya bir sayi bir String arasinda kullanilirsa;
        //CONCATINATION(birlestirme) olur
       //Note: Concatination islemlerinde java matematik teki islem önceligi kurallarini kullanir

        /*
        Matematikte islem önceligi
        -önce üslü sorula
        -parantez ici islemler yapilir
        -Capma ve Bölmeler yapilir
        -Toplama ve cikarmalar yapilir
        -Ayni öncelikli olanlarda soldan saga
         */
    //Örnek2: Size String olarak verilen iki fiyatin toplami

        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);  //23005200

         // Integar.valueOf () string degerleri integer a cevirir
        int toplamFiyat = Integer.valueOf(shirt)+ Integer.valueOf(shoes); //7500

        //Örnek3) Size String olarak verilen iki fiyatin toplamini ekrana yazdir

        String  tv ="$1100";
        String radio ="$300";
        System.out.println(tv+radio); //$1100$300, concatination yapar

        int totalPreis= Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPreis);

        // Note: valueOf () methodu tüm karakterlri rakam olan Stringleri sayilara cevir
        // eger valueOf () methodu kullanilirken String in icine rakam olmayan bir karakter koyarsaniz hata alirsinizi
        // valueOf () method kullanilirken sadece rakam olan karaterler kullanilmalidir









    }
}
