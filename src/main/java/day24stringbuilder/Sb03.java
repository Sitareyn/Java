package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {
        /*
        1)StringBuffer java da string üreten bir deger classtir
          StringBuffer java nin string üretmek icin olusturdugu ilk class tir
        2)StringBuffer , StringBiulder a cok benzer , yani ikisi de "mutable" üretir.
        3)StringBuffer "multi-thread'dir ama StringBuilder "multi-thread" degildir.
        4)StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir
        5)"multi-thread" yapilirken yapilan islerin siralamasi önem arzeder,
           yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
           StringBuffer multithread oldugu icin ayni zamanda "synchronized" dir.


        3tane String olusturan class ögrendik
            1)immutable String lazimsa;String class
            2)Mutable String lazimsa; StringBuilder veya StringBuffer
                       a)StringBuilder i "multi-thread" gerekmezse kullaniriz
                       b)StringBuffer i "multi-thread" gerekirse kullaniriz.
         */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf); //Java

        System.out.println(sbf.capacity());


    }
}
