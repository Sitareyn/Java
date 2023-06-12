package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        //HashMap arkasinda calisan mekanizma nasil?

        //Java bucketlar icinde LinkList kullanir. Entryleri birbirine bagliyor.
        // Indexte birden fazla entry olduysa onlari node yapisi gibi birbirine baglar.

        HashMap<String,String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Turkiye","Ankara");
        capitals.get("Turkiye");
        capitals.put("Italy","Floransa");
        System.out.println(capitals.hashCode());

    }
}
