package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        //Array listler coklu data depolamak icindir.
        //Arrayler e sadece primitive data koyabilirsiniz. non-primitive data koyamiyoruz,koyarsak sadece adreslerini görüyorduk
        /*
        1)Ayni data type indaki coktu datalari depolamak icin Array kullaniriz.
        2)Arrayleriin negatif bir yönü var ,icine koyacaginiz eleman sayisini en basta belirlemek gerekiyor.
        3)Array ler eleman sayisinda esnek degildir.Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 elaman koyarsaniz eleman sayisini 1000 olarak ayarlar
        4)Attaylist yerine esadece List de diyebilirsiniz
        5)Java Arraylistleri olusturduktan sonra Arrayleri iptal etmedi cünkü;
               a)Arrayl süper hiizlidir
               b)Arraylerr memory de cok az yer kaplar
               c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Array ler tercih edilir
        6)Array ler primitive data type lari ve "referance"lari depolayabilr.
        Ama Arraylistler non-primitive data type lari depolar, Bu nedenle Arraylistler Array lerden daha fazla yer kaplarlar
             */

        //Arraylist nasil olusturulur?
        ArrayList<Integer> ages=new ArrayList<Integer>();

        //Arraylist konsola  nasil yazdirilir?
        System.out.println(ages);

        //Arraylistlere eleman nasil eklenir?
        //Arraylistlere eleman eklemek icin "add" methodunu kullaniriz.Add methodu elemanlari sizin verdiginiz sirada list e ekler
        //Buna (Insetion order) denir

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
       ages.add(888);
        System.out.println(ages); //[9, 656, 12, 777, 10, 888]

        //List e coklu eleman nasil eklenir? veya List e baska bir list nasil eklenir
        //Bir list e coklu eleman eklemek icin o elemanlari öncelikle bir List in icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges); //[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages); //[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages); //[9, 656,8, 9, 10 ,12, 777, 10, 888,8,9,10]

        //ArrayList te eleman sayisi nasil bulunur?
        //Size() methodu bir List teki eleman sayisini verir
        int numOfElement = ages.size();
        System.out.println(numOfElement); //12

        //ArrayList te specifik bir eleman nasil alinir?
        //Get() methodu index kullnarak istedigimiz index i almaya yarar
       int el1 = ages.get(1);
        System.out.println(el1); //656
     //ArrayList te specific bir elemani nasil degistirebiliriz?

       ages.set(6,111);
        System.out.println(ages);

        ages.set(4,313);
        System.out.println(ages);
    //Bir listte tüm elemanlari nasil silebiliriz?
        ages.clear();
        System.out.println(ages); // []

    //ArrayList te specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r = ages.contains(313);
        System.out.println(r);  // False


    //Bir arrayList in bos olup olmadigini nasil kontrol ederiz?
        boolean r2 = ages.isEmpty();
        //Isempty methodu Array list bos ise true bos degilse false return eder.
    //Size verilen bir List in bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String > names = new ArrayList<>();
        names.add("Saadet");
        names.add("Kasim");
        names.add("Ekim");
        names.add("Ali");
        names.add("enes");
        //1.way

        if (names.size()==0){
            System.out.println("List ist empty");

        }else {
            System.out.println("List has at least 1 elemant");
        }

        names.clear();

        //2.Yol
        if (names.isEmpty()){
            System.out.println("List ist empty");

        }else {
            System.out.println("List has at least 1 elemant");
        }

        /*
        Bir methodu ögrenirken asagidaki üc seyi ögrenin
        1) O method ne is yapar
        2) O method nasil kullanilir
        3) O method size ne return eder? size neyi verir?
         */





    }
}
