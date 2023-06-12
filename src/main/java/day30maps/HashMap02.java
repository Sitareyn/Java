package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Suat" , 36);
        stdAges.put("Yusuf", 33);
        stdAges.put("Serkant" , 26);
        stdAges.put("Emin", 19);
        stdAges.put("Alparslan" ,30);
        //Key i tekrarli kullandiginizda hata vermez,en son verilen "Entry nin degerini kabul eder
        //Bu yöntem value güncelleme icin kullanilabilir, Buna overwrite denir.
        stdAges.put("Alparslan", 33);


       //Map ler entry leri siralarken key lere bakarak siralama yapar
      // HashMap ler entry leri rastgele siralar bu yüzden cok hizli calisir.

        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=33, Serkant=26, Emin=19}
                                                            /////////


        //replace() methodu value lari keyler kullanarak uptade etmeye yarar
        stdAges.replace("Alparslan",19);
        System.out.println(stdAges); //{Suat=36, Yusuf=33, Alparslan=19, Serkant=26, Emin=19}


     //replace("Serkant",26,23)) methodu map icinde Gülce varsa ve degeri 30 ise yeni deegr 35 olsun , degilse olmasin demek
        stdAges.replace("Serkant",26,23);
        System.out.println(stdAges); //{Hasan=35, Süleyman=33, Gülce=35, Abdullah=24, Benna=32}


    // PutIfAbsend("Ali", 30); methodu map ile Ali key olarak yoksa Ali key ini  30 value ile ekler yoksa eklemez
        stdAges.putIfAbsent("Ali",30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19, Ali=30}


    //get() ve getOrDefault() methodu eger aranan eleman map te varsa ayni value yu verir
        System.out.println(stdAges.get("Abdullah")); //24
        System.out.println(stdAges.getOrDefault("Abdullah", 0)); //24


        System.out.println(stdAges.get("Yusuf")); //33
        System.out.println(stdAges.getOrDefault("Yusuf", 0)); //33
        //Eger aranan eleman map te yoksa get() methodu null verir
        //getOrDefault() methodu sizin belirttiginiz degeri verir

        System.out.println(stdAges.get("Fatih")); //null
        System.out.println(stdAges.getOrDefault("Fatih", 0)); //0



        //containsValue(63) methodu map in icindeki value larin icerisinde 313 olup olmadiigni kontrol eder
        System.out.println(stdAges.containsValue(313)); //False

    //containsKey("Seda") methodu map in icindeki key lerin icerisinde "Yusuf" olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Yusuf")); //True

      //remove ("Emin") methodu key kullanarak entry i silmeye yarar
        stdAges.remove("Emin");
        System.out.println(stdAges); //{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Ali=30}

      //remove("Suat",36); methodu hem key hem value kismini kontrol eder ,eslesirse siler
        stdAges.remove("Suat",36);
        System.out.println(stdAges);

    }
}
