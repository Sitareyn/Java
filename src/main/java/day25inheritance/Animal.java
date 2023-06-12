package day25inheritance;

import day24stringbuilder.Student;

import java.util.function.DoubleBinaryOperator;

public class Animal extends Student {
    //Inheritance==>Miras alma
    /*Özellikleri bir classtan diger class a alan kavramdir.Bunun Java daki karsiligi sudur:
    Mesela siz bir class olusturacaksiniz ama daha önce olusturulmus bir class sizin istediginiz
    özelliklerin bir cogunu kapsiyor.
    O zaman direkt yeni olusturdugunuz class i özelliklerini kullanmak istediginiz class a
    child yapariz

    Inheritens in faydalari
    1)Code tekrarlarindan kurtuluruz
    2)Code tamiri (maintenance) kolay olur
    3)Child class lari daha Atomic yapmis oluruz

    =>Bir class i baska bir class in child class i yapmak icin "extends" keywordu kullanilir
    Ilk yazilan class child, ikinci yazilan class parent (veya super) olur.
    =>Child class obbjectleri Parent Class dan method ve variablellari kullanabilirler.
    =>Parent class objectleri child class dan method() ve variablellari kullanamazlar.

   =>Javada bir classin sadece 1 tane parenti i olabilir Coklu parent a "Multiple Inheritance" derler
     tekli parent a "Single Inheritance" derler, java Multiple Inheritance i desteklemez
     java "Single Inheritance " kullanir

     =>Apartman seklindeki inheritance yapisina "Multilevel inheritance " denir
     Java "Multilevel inheritance " i destekler

     => Object Class her classin parentidir. Java da Object Class haric her classin parenti vardir
        Javada parent i olmayan tek class Object classtir

     => Javada parenttan childa olan iliskilere "HAS-A Relationship " denir
        child dan parent a olan iliskilere "IS-A Relationship " denir

    => Javada her classin bir tane default constructor i vardir. Bu default constructor classin icinde gorunmez cunku
        constructor "Object Class" icindedir.

*/

    public void eat(){
        System.out.println("Animals eat . . ");
    }

    public void drink(){
        System.out.println("Animals drink . . ");
    }












}
