package day01variables;

public class Variables01 {
    public static void main(String[] args)    {


    //java bu satiri okumaz,kendimize ve baskalarina aciklama satiridir
        /*
        java bu satirlari da okumaz
         */

   //Variable (pasifozelliklerdir,programimizin akisindaki kutudur.nasil olusturulur?
   //Data type + variable ismi + Assigment Operator(aatama operatörü) + Variable degeri+ noktali virgül
   int               age                 =                                  13                 ;
   // java cümlesi ==>statemant
        // dilbilgisindeki nokta javada noktali virgüldür. yani statementin bittigini gösterir
        //Eger Variable declaration yapar, Assignment yapmazsaniz java kendi default degerlerini koyar
        //Default deger sayilar icin sifirdir
        //Java da "=" assignment operator dir ve java bu operatörü gördügü zaman önce sag tarafi calistirir.
        // ve sagdaki degeri alir soldaki kutuya koyar.
        //Javada esittir demek "==" demektir.
        //Data type + VariableName ==> Variable declaration
        //Assignment Operator (=) + Variable degeri ==> Assignment

        /*
        javada temelde iki tip Data type vardir
        1)Primitive data type:
        char,boolean,byte, short , int , long, float, double,
        2)non-primitive data type:
        String
         */

    //Ornek1: Ogrenci ismi icin bir variable olusturup deger olarak Ali Can atayiniz
        //Data type + variable ismi + Assigment Operator(aatama operatörü) + Variable degeri+ noktali virgül
        String          ögrenciAdi              =                               "Ali Can"            ;
        //Stringlere verilen degerlere daima cift tirnak icinde yazilmalidir
        //Stringler icin "default valve " (==>varsayilan deger) "null" dir
        /*
        String bir variable olusturdugumuzda cogu zaman ona bir deger atariz. atama yapmazsak, java o variable
        a varsayilan deger olarak null koyar.
        null demek sifir demek degildr,0 da coding te bir degerdir,null hiclik demektir.
        icinde variable yada methot bulunmayan bos obje demektir
         */


        //Char data type
        // Tek karakterler icin kullanilir. sayi olur harf olur sembol olur farketmez. tek olmasi önemlidir.
        // örnegin ==> A , X , ? , 5 .....

        //Örnek2: char data type nde bir ismin ilk harfi olaak bir variable olusturunuz ve bir deger atayin.

        char isminIlkHarfi = 'A' ;
        //Note: char data type nde degerler daime cift tirnak icinde yazilir.

       //homework
        char gunlukOgunSayisi = '3';

       // boolean data type:
        //booleanlar sadece iki farkli deger alabilir; true(dogru) yaha false (yanlis)
        //o yuzden isimlendirme yapilirken inglizce olarak "mi" soru eki anlaminda is konur.
       // Ornek3 : boolean data tipinde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
        boolean isRetired = false ;
        //homework
        boolean isHungry = true ;

        //byte data type
        //tam sayilar icin kullanilir, hafizada 1 byte yer kaplar
        //byte : -128 den +127 e (dahil) kadar tamsayi degerleri icin kullanilir
        //Ornek4 : byte data type nde ögrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte studentAge = 16 ;

        //short data type
        //tam sayilar icin kullanilir, hafizada 2 byte yer kaplar
        //short: -32768 den +32767 e (dahil) kadar tam sayi degerleri icin kullanilir

        //Ornek5 : site nüfusu icin deger atayiniz
        short siteNufusu = 1200;

        //int data type
        //tam sayilar icin kullanilir, hafizada 4 byte yer kaplar
     //int: -2,147,483,648 ile 2,147,483,647 (dahil) kadar tam sayi degerleri icin kullanilir
        //Ornek6: Ulke nufuslari icin bir variable olusturun ve deger atamasi yapin
        int ulkeNufusu = 1313131313;

        //long data type:
        //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar
        //-9,223,372,036,854,775,808 ile +9,223,372,036,854,775,807 (dahil) kadar tam sayi degerleri icin kullanilir
        //basina ne kadar long da yazsak java memory korumak icin int kabul eder
        //biz long da israr ediyorsak sonuna "L" yada "l" konulur.

        //Ornek 7 : Insan vücudundaki hücre sayisi icin variable olusturun ve  deger atamasi yapin
        long cellNummerInHumanBody = 123246547659871234L;
    //Eger long a atadiginiz deger int lerin araliginda ise sonuna L koymaya gerek yoktur
        long weightOfSun = 1234561112;

        //float data type:
        //float virgüllü sayilar (Decimal Number==>ondalikli sayilar) icin kullanilir(fiyatlandirmalar-12,99

        //Ornek 8: Gömlek ve ayakkabi fiyatlari icin iki tane variable olusturun
        //Java ondalikli sayilari otomatik olarak "double"kabul eder.
        //Siz data type ini float yazarsaniz hata alirsiniz,
        //float olmasinda israr ediyorsaniz sonuna büyük yada kücük "F"koymalisiniz
        float shirtPrice = 12.99f;
        float shoesPrice = 15.99f;

       //double data type: 8 byte yer kaplar
       //ondalikli kismi icin daha fazla rakam alabilir.hücre agirligi gibi blmsel calsmlarda kullanlblr

       //Ornek9:Hücre agirligi ve Amip in agirligi icin iki tane variable olusturunz
       double weightCell = 0.00000000000013;
       double weightAmip = 0.00000000000003;

       //ornek 10: Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdiriniz
        byte note1 = 50;
        byte note2 = 70;

        //System.out.println(); kodu ekrana yazdirir. sistemde olan bilgileri(bu sayfadaki hersey) ekrana yazdirir

        System.out.println(note1);
        System.out.print(note2);

        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirdda tutar



    }


}
