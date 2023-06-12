package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        //Coklu datalari depolayabilen yapilara collection deriz

        ArrayList<String> list1 = new ArrayList<>();   //bu ilk olusturma seklimiz
        List<String> list2 = new ArrayList<>();  // data tipini list secebildik cunku parenti Array list in
//Array list is a List, array list is a Collection, Array list is an Interable, Array list is an Object diye tanimlanabilir.


   //Array list ler eleman silme ve ekleme de tekrar indexleme yapmak zoriunda olduklarindan eleman ekleme
        //ve silme de basarisizdirlar

     //LinkedListler index kullanmazlar bu yüzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz
        //LinkedListlerde node ekleme ve silme islemleri yaparken sadece pointerleri degistirir

   /*
   1)ArrayListler eleman ekleme ve silme islemlerinde basarisizdirlar
    bu yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez
   2)LinkedList ler index kullanmadiklarinda node silme ve ekleme de re-index yapilmasina gerek yoktur
   Bu da LinkedList leri eleman ekleme ve silme e cok basarili hale getirir
   Bu yüzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir
   3)ArrayList lerde search islemi kolay yapilir cünkü indexler adres gibidir .
   4)LinledListlerde search islemi zor yapilir cünkü LinkedList ler index kullanmaz index kullanmayinca herhangi bir elemani bulmak icin
   en bastan tüm elemanlar kontrol edilir. Bu da cok fazla is demektir.
    */

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bünyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        s.addLast("Emin");
        s.addFirst("Mahmut Tuncer");
        System.out.println(s);



    }
}
