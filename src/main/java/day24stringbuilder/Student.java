package day24stringbuilder;

public class Student {
    /*
    Access Modifier
    1)public
    2)protected
    3)default (Access modifier i default yapmak icin access modifier ini yazmayiz
    4)private

     NOTE) Access Modifierlari genisten dara dogru siralayiniz
     public > protected > default > private

     Note: public ==> olanlar her class dan kullanilir
           protected ==> olanlar baska package lardan kullanilamaz
          ama baska package da child class icinden kullanilabilir
           default ==> olanlar baska package lardan kullanilamaz
           private ==> olanlar sadece olusturduklari class icinde kullanilabilirler

     Note: "protected" ile "default" un farkini söyleyiniz
     -protected olanlar baska package tan kullanilamaz ancak baska package de child class icinden
     kullanilabilir.
     -default olanlar baska package den kullanilamaz
*/


    public String stdName = "Ali Can";  //Her class tan kullanabilir

    //protected olanlar baska package dan sadece child classlardan görülür
    protected String address = "Istanbul";

    //default olanlar baska package ve childlerinden kullanilamazlar
    String eMail = "alican@gmail.com";

    //private olanlar sadece kendi class larinda kullanilabilirler
    private String ssnId = "1234566789";
}