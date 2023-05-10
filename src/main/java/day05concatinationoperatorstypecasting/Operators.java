package day05concatinationoperatorstypecasting;

public class Operators {
    /*
        1-) + , - , * , / islemleri java da matematikteki gibi kullanilir
        Note: int/int==> int olur tam sayiyi tam sayiyia böldügünde küsüru atar
        Note: double + int ==> double olur
        Cünkü ; java da amatematiksel islemlerde farkli data type lari kullaniirsa sonuc
        her zaman büyük data type inda olur

        2-) Java da "Logical Operator" lar vardir. AND ve OR islemelri Logical operatorlardir
         i-) And (&&) isleminde true alabilmek icin hersey true olmalidir
             And islemi mükemmelliyetcidir
             And isleminde bir tane false sonucu false yapar

         ii) OR isleminde (||) bir tane true sonucu true yapmaya yeter
             OR isleminde sonucun false olmaasi icin hersey false olmalidir
             OR islemi polyanna gibidir

         iii) NOT Operator (!) true olani false ; false olani true yapar
         !true==> false
         !false==> true
         !!true==>true

         3)Comparison (Karsilastirma) Operators
            <,>,<=,>=,==,!=
    NOTE: Karsilastirma operatorlarini kullandiginizda kesinlikle boolean (true veya false) alirsiniz

    NOTE: biz AND islemi yapacagimiz zaman && iki tane kullaniriz ama zaman zaman
    bir tane de gördügümüz zamanlar olur.
    * "&&" ikili kullanimda ilk ifade false oldugunda Java digerlerini kontrol etme
    gereksinimi duymaz direkt false yazar. Cünkü and isleminde ilk ifade false ise
    digerlerinin ne oldugunun bi önemi yok.
    *  & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder sonuc ayni olur
     ama tek tek baktigi icin  yavas calisir
            bu yuzden biz hep && kullaniriz.


           */
    public static void main(String[] args) {
        boolean first = 3<5;
        boolean second = 2+3 !=5;
        boolean third = 2+3*5>=19;

        System.out.println(first+" - "+second+" - "+third ); //true false - false

        System.out.println(first && second); //false
        System.out.println(first || second || third); //true


    }




    }

