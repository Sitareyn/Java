package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Örnek1) Bir Stringin belirli bir karakterinden baslayarak belirli bir karaktere dynamic olarak aliniz
        //          abc@gmail.com ===>gmail

        String a = "abc@gmail.com";
        int startingIndex=a.indexOf('@')+1;

        int endingIndex = a.indexOf('.');

        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);

        System.out.println("hard coding ==>"+a.substring(4,9));

        String h = "Ali Can";
        String i = "Ali Can";
        boolean result = h.equals(i);
        System.out.println("result = " + result);

        /*Java da memory kullanimi;Iki tür memory vardir:
        1) Stack memory==>small(kücük)
             a) Kücük memory dir
             b)Primitive leri ve non-primitive lerin adreslerini tutAr
        2) Head memory==> hulk (büyük)
             a)Büyük memorydir
             b)Non-Primitive datalari icerir
             ==>Java heap memory de yerlestirilen tüm non-primitive datalar icin bir adres olusturur
             ve bu adresi stack memory de saklar

         */
        /*
        NOTE:Stringlerin esitliklerini kontrol ederkencift esit(==) yerine "equals()" methodu kullaniriz
         Neden kullaninriz?
         Cünkü "==" sembolu iki string i karsilastirirken hem adreslerine hem de degerlerine bakar
         ikisi de ayni ise Stringler esittir de. ama biz code yazarken genellikle Stringlerin adresleri ile degil
         degerleri ile ilgileniriz.Bu yüzden String karsilaastirmalarinda "==" kullanmayiz

         "equals()" methodu ise iki stringi karsilastirirken sadece degerlerine bakar . degerleri ayni ise bu iki string
         esittir der , degerler farkli ise bu iki string frklidir der ki bu bizim code yazarken ihtiyac duydugumuz seydir
         */

       //Örnek3)
        String s = "Tom";
        String t = "Terry";
        String r= new String("Tom");

        System.out.println(s==t);//False cünkü adresler ve degerler farkli
        System.out.println(s.equals(t)); //false cünkü degerler farkli
        System.out.println(s==r);//false cünkü adresler farkli
        System.out.println(s.equals(r)); //True cünkü equals sadece degerlere bakar "s" ve"r" nin degerleri ayni oldugundan true verir

        //Örnak4) Verilen iki Stringin birnbirinin aynisi olup olmadigini Büyük harf Kücük harf dikkate almadan
        //kontrol eden kod yaziniz
        //equalsIgnoreCase()iki Stringin birnbirinin aynisi olup olmadigini Büyük harf Kücük harf dikkate almadan
        // kontrol eder

        String j= "ali can";
        String k= "Ali Can";
        boolean result3 = j.equalsIgnoreCase(k);
        System.out.println("result3 = " + result3); //True
     /*
     Homework
       //Bir String variable olusturunuz ve bu stringdeki rakam olmayan karakterlerin sayisini konsola yazdiriniz
        //Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri konsolda buyuk harfle yazdiriniz,
        //Bir String variable olusturunuz ve bu Stringdeki ilk ve son karakterlerin ascii degerlerini konsola yazdiriniz
        //Tek kelimeli bir sehir ismi icin bir variable olusturun ve sehir isminin ilk harfini Buyuk harf ile diger harflerini kucuk harflerle yazidrniz.
        //Asagidaki kurallara gore kullanicinin girinigi password u kontrol ediniz
        //a) en az 6 karakter olsun
        //b)en az bir tane buyuk harf icersin
        //c) en az bir tane kucuk harf olsun
        //d) en az bir tane rakam olsun
        NOTE1) Önce canli oturum sirasinda cözülen örnekleri yapiniz
        NOTE2) Tum sorulari dinamik kodlarla cozulmelidir
        Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz */





    }
}
