package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Arraylaeri kisa yoldan nasil olusturabiliriz

        int arr [] = {63,7,313,8,4};
        System.out.println(Arrays.toString(arr)); //[63,7,313,8,4]

        //Örnek1) Verilen array da kac tane tek sayi ve kac tane cift sayi oldugunu bulan kodu yazdiriniz.

        int sayac=0;
        for (int w : arr) {
            if (w % 2 == 0) {
                sayac++;
            }
        }

        System.out.println("Array de" +sayac+ " adet cif sayi " + (arr.length-sayac)+"adet tek sayi kullanilmistir");

 //Örnek2) Size verilen bir string array deki isimlerden 5 character den az character icerenleri console a yazdiriniz

        String [] stdNames  = new String[5];

        stdNames [0]= "Ajda";
        stdNames [1]= "Ayhan";
        stdNames [2]= "Tom";
        stdNames [3]= "Cüneyt";
        stdNames [4]= "Filiz";
        for (String w : stdNames){

            if (w.length()<5){

                System.out.println(w);
            }


        }

//Örnek3) Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimler haric diger isimleri console a yazdiriniz

        //Note: sort() methodu sayisal data type larini kucukten büyüge siralar(ascending order)
        //Note2:sort() methodeu string data type lerini alfabetik olarak siralar (alphabetical order)
        //Note3:  ascending order + alphabetical order ==> Natural Order
        //Note4: sort() methodu array elemanlarini Naturalrder a göre siralar

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames)); //Ajda,Ayhan,Cuneyt,Filiz,Tom]


        for (String w : stdNames){
            if (w.startsWith("F")){

                continue;
            }
            System.out.println("w = " + w);
        }





    }
}
