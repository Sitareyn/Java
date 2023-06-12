package day28interfacecollections;

public interface Ac {

    public abstract void cool();
    void run();
    int price = 2000;

    /*
    1) Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniriz
    2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen
    multiple parent a ihtiyac duyariz
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) interfacelerin icine conceret method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun isi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilaacgini childa birakirsaniz chil classin kafa karisikligini engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olara public dir, abstracttir, static degildir
    5)interfaceler concrete method iceremezler dolayisyal interface icindeki hicbirsey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir
    6)Coklu interface parentlerin her birinin icine ayni isimli methodlar koyabiliriz.
    Mesela "Ac" nin , "Engine" in ve "Security" nin iclerine "run()" methodu koymak gibi
    Child class herhangi birini override ettiginde hepsini override etmis olur, sonra da body i child
    class da yazarak uygulamasini yapmis olur.
    7)  a)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "final" dir. bu yüzden interface icindeki variable i olusturdugunuzda
    mutlaka deger atamasi yapmalisiniz . Bilindigi gibi "Final" variable larin degerleri degistirilemez
        b)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "public" dir.
        c)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "static" dir.
     ==>Dolayisiyla interface lerde variable cagirirken interface adini kullanarak cagiririz. bu hem static variable olmanin geregidir, hem de okunurlugu arttirir
     8)Normalde "interface" icine "concrete method" konulamaz ama bazi özel durumlarda "concrete method"
     koymamiz gerekirse default keyword kullanarak bunu yapabiliriz.
     Static keyword unu kullanarak da interface icine concrete method koyabiliriz
     9) "default" keyword unu kullanarak olusturdugunuz "concrete method"lara inter face in child class indan
     object olusturarak ulasabilirsiniz.
     "Static keywordunu" kullanarak olusturdugunuz concrete methoslara ulasmak icin obje olusturmaya gerek yoktur interface ismi yeterlidir
    10)Interfacelerden object olusturulamaz .Interfacelerin constructor leri yoktur
    11)
           Child        Parent     ==>   keyword
           class        class      ==>  extends
           interface    interface  ==>  extends
           class        interface  ==>  implament
           interface    class      ==>  OLAMAZ
   Ayni ise "extends" farkli ise implement kullaniriz, ve interface concrete class in child i olamaz


   1)Abstract classlar hem abstract hem de concrete methodlar icerebilir fakat interface ler sadece abstract method icerir
   ama interface lerde  istersek "default" ve "static" keywordlerini kullanarak "concrete" method üretebiliriz
   2)Abstract class lar multiple inheritance i desteklemez. ama interface ler destekler
   3)Abstract class lar icinde her türlü variable olusturulabilir. interface ler icindeki variabllar public,static ve final olmak zorundadir
   4)Interface Class in child i olamaz ama Abstract class classin child i olabilir
   5)Abstract class larda constructor vardir ama object üretemez,interfacelerde constructor hic yoktur bu
   yüzden object üretilemez
     */


}
