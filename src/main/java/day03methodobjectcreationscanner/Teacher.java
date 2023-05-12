package day03methodobjectcreationscanner;

public class Teacher {
    //homework
    //icinde isim ve yas variable lari ile
    //teach methodu bulunan bir teacher objecti ve bu özellikleri kullanin

    public String isim = "Himmet";
    public int yasi=34;

    public String brans = "Türk Dili ve Edebiyati";
    public int deneyimYili = 10;

    public static void teach (){
        System.out.println("Dersleri kolaylastirip sevdirmeyi amaclar \n"+"Hayat onun ögrettikleri ile hep daha kolaydir");
    }
    public static void beceri (){
        System.out.println("Cocuklarla nasil iliski kuracagini cok iyi bilir ve kaliteli espri yapmada üstüne yoktur");
    }
    public static void takip (){
        System.out.println("Hem ailesinin hem de ögrencilerinin her probleminde yanlarinda olur ve tam destek verir ");

    }
    public static void kolay (){
        System.out.println("Yeni nesil ögrenciler cok sansli" +
                ".........cünkü hersey onunla daha kolay ;)" +
                "iyi ki varsin bitanem... Seni cok Seviyorum ");
    }

}
