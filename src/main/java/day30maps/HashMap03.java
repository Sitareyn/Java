package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        //Example 1= Verilen cümledeki kelimelerin görünüm sayisini veren kodu yaziniz
        // "I like you, like like "=> I=1 , like=3 , you=1

        String s ="I like you like like";
        s.replaceAll("\\p{Punct}" , "");
        System.out.println(s);

        //Kelimelerin görünüm sayisini bulacagimiz icin String i kelimelere böldük
        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));


     //words Array indeki kelimeleri birer birer map de var mi yok mu diye kontrol edecegiz
     //words Array indeki kelimeler Map de yoksa Map e value si 1 olarak yerlestirilecek
     //words Array indeki kelimeler Map de varsa Map e var olan value u 1 artirarak ekle diyecegiz

        HashMap<String,Integer> occ = new HashMap<>();

        for (String w : words) {
          Integer numOffOccurance = occ.get(w);
          if (numOffOccurance==null){
              occ.put(w,1);

            }else {
              occ.replace(w,numOffOccurance+1); //{like=3, I=1, you=1}
          }


        }
        System.out.println(occ);

         /*
        Home work:
        Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
         */




    }
}
