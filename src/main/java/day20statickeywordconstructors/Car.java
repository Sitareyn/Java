package day20statickeywordconstructors;

public class Car {

    /*
    Constructor nedir?
    Class dan object üretmemize yarayan code blocklaridir
    class olusturdugumuzda Java bize otomatic olarak bir constructor verir
    ama bu Constructor gözle görülmez.Gözle görülmeyen otomatic olarak Java tarafindan verilen
     bu Constructor lara "default constructor" denir public Car (){ } seklindedir

     Bir class ta farkli parametreler kullanarak istediginiz kadar "Constructor" olusturabilirsiniz
     ve Farkli constructorlar sayesinde bir class tan farkli farkli objectler olusturabilirsiniz.

     1)Constructor nasil olusturulur?
     Access modifier + Class ismi + () + {}

     Interview sorusu
     2)Method ile constructor arasindaki farklar nelerdir?
        a)Methodlarda return Type olur ,Constuctor larda olmaz
        b)Methodlar yaptiklari ise göre isimlendirilirler, Constructorlar her zaman class ismi ile isimlendirilirle
        c)Methodlar bir aksiyon yaomak icin olusturulur , Constructorlar ise object olusturmak icindir
        d)Method isimleri kücük harf ile baslar, Constructor isimleri class isimleri ile ayni olduklari icin büüyük harf ile baslarlar

     3)Parametreli constructorlar olusturularak ayni class dan farkli özelliklere sahip objectler olusturabiliriz




     */

    String make ="Honda";
    String model="Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car (String make,String model, int year, boolean hybrid ){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }
    public Car (String make,String model){
        this.make=make;
        this.model=model;
    }


    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
