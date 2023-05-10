package day05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        Java da her karakterin sayisal bir degeri vardir
        Bu degerler ASCII degerler olarak adlandirirlir
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir
         */
        char a = 'a';
        System.out.println("a = " + a); //a

        int intA = 'a';
        System.out.println("intA = " + intA); // 97(ascii degerini verir)
        //Herhangi bir karakterin Ascii degerini bulmak icin o karakteri
        //"int" data type inda bir Variable icine koyunuz.

        byte unlem= '!';
        System.out.println("unlem = " + unlem); // 33 (ascii degerini verir)

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1+c2); //138 ( ve ünlemin ascii deger toplami)
        //Java da char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerlerini kullanir

    }




}
