package day30maps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {

        /*
       1) Map lerde sözlüklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
       2) Key kismi tekrarsiz olur , ama value kismi tekrarli olabilir
       3) Map lerdeki her bir elemana "Entry" denir tamamina ise "EntrySet" denir.
       4) Entry ler tekrarsiz oldugu icin EntrySet denir.
       5) Key ve Value lar ayri ayri data typelarinda olabilirler.
       6) Map ler "Collection" degildir, farkli bir yapidir.
       7) HashMap ler
         */

    //Map nasil olusturulur?

        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany" , 83000000);
        countryPopulation.put("Albania" , 3000000);
        countryPopulation.put("USA" , 400000000);
        countryPopulation.put("Turkey" , 83000000);
        countryPopulation.put("Netherland" , 18000000);
        System.out.println(countryPopulation); //{Netherland=18000000, USA=40000000, Turkey=83000000, Germany=83000000, Albania=30000000}


       //get() methodu "key" ile calisir ve value kismini verir
        Integer usaPopulation =countryPopulation.get("USA");
        System.out.println(usaPopulation); //40000000


      //Bütün key leri nasil alabiliriz
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

     //Bütün Value lari nasil alabiliriz
        Collection<Integer> value = countryPopulation.values();
        System.out.println(value); //[18000000, 40000000, 83000000, 83000000, 30000000]

        //Ornek: CountryPopulation map indeki ülkelerin nüfuslarinin ortalamasi nedir?
        Collection<Integer> values = countryPopulation.values();

       int sum=0;
        for (Integer w : values) {
          sum= sum+ w;
        }
        System.out.println(sum/values.size()); //117400000

       //Loop lar map ler ile kullanilamaz, bunun icicn entrySet methodunu kullaniriz
       //EntrySet() map teki entry leri kalip halinde alip bize Set in icine koyarak verir
        Set<Map.Entry<String,Integer> >entries = countryPopulation.entrySet();
        System.out.println(entries);

        //Ornek 2: countrypopulation Map indeki ülkelerin isimlerinin caraktereleri sayisi le nufuslarin toplami
         int toplam= 0;
        for (Map.Entry<String,Integer> w : entries ) {
           toplam= toplam+ w.getKey().length() + w.getValue();

        }

    }

}
