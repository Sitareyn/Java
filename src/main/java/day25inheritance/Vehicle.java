package day25inheritance;

public class Vehicle {
    public Vehicle(){
        this(3000);
        System.out.println("Vehicle 1");
    }
    public Vehicle (int price){
        System.out.println("Vehicle 2");
    }
    /*
    1)Child Class dan bir Object olusturdugunuzda
    Constructor lar en üstteki parent
    class an baslatilarak alta dogru calisir.
     2) Child Classtaki constructor dan Parent Classtaki constructor a gidebilmek icin
    super() kullanilir.
    3) Parent classta birden fazla constructor varsa istenilen constructor
    constructor super() ifadesinin parantezi icine yazilan parametereler yardimi ile secilebilir
    4)Ayni class icindeki constructor lari secmek icin this() kullanilir
    Ayni classta birden fazla constructor varsa istenilen constructor
    constructor this() ifadesinin parantezi icine yazilan parametereler yardimi ile secilebilir
    5) super() ifadesini yazmak istege baglidir, yani yazmasaniz da Java sanki super varmis gibi davranir
    Ama kodunuzu daha okunur kilmak icin yazabilirsiniz.
    6)super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir
    7)Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir(bknz.6)
    8)Inheritance da variable lari ve method lari bir class dan cagirmak icin this veya super kullanilir
    this ayni class icindeki methodlari cagirmak icin kullanilir
    super ise parent class daki methodlari cagirmak icin kullanilir

     */
}
