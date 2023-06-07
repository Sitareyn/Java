package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Bir list in baska bir list ile ayni olup olmadiigini nasil kontrol ederiz?  *equals
        //Iki list in esit olabilmesi icin sadece ayni elemanlara sahip olmasi yetmez .
        //Ayni elemanlarin ayni index te olmasi lazim
        ArrayList<String> names1 =new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");


       ArrayList<String> names2 =new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
         boolean s=names1.equals(names2);
        System.out.println(s);

        //Örnek: Verilen iki Integer listte tamamimyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz


        ArrayList<Integer> nums1 =new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 =new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean result = nums1.equals(nums2);
        //Array listte bir elemanin ilk görünümü nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Yozgat, Barcelona]

//Remove()Methodu bir elemanin ilk görünümünü siler
        System.out.println(cities.remove("Miami")); //True
        System.out.println(cities); //[Istanbul, Yozgat, Barcelona, Miami, Istanbul, Yozgat, Barcelona]

        //ArrayList te bir eleman index kullanilarak nasi silinir?
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove()Methodu index ile kullanilirsa size silmis oldugu datayi return eder
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder

        //Ornek:bIR integer List olusturun ve 12 elemani list ten silinz

        //ArrrayList olustururken sag tarafa (Constructor) ArrayList yazman zorundasiniz
        //ama sol tarafa ister ArrayList ister de List yazin ikisi de calisir
        //Detaylari Collection konusunda görecegiz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

     //   ages.remove(12);  //Tam sayiyi java primitive int kabul eder
     //   System.out.println(ages);


        //1 . yol
//        Integer nonPrimitive =12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2. yol
        ages.remove((Integer) 12);
        System.out.println(ages);

        //3. yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

        //4. yol
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);

//Bir ArrayList teki bir elemann tüm görünümlerini nasil sileriz
      List<String> citiesToRemove=new ArrayList<>();
      citiesToRemove.add("Yozgat");
      citiesToRemove.add("Istanbul");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);


    }
}
