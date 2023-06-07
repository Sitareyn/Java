package day19passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

add(3,5);


    }

public static void add (int a , int b){
    System.out.println(a+b);
    }


    public static void add (double a , double b){
        System.out.println(a+b);
    }

    public static void add (int a , double b){
        System.out.println(a+b);
    }
    public static void add (double a , int b){
        System.out.println(a+b);
    }
/*
Ayni methoda farkli farkli
1)Method overloading yaparken ismi degistirilmez
2)Method overloading yaparken parametreler degistirilir
     a)Parametreleri degistirirken ,parametreleri data type leri degistirilebilir
     b)Parametre degistirirken , parametreelrin sayisi degistirilebilir
     c)Parametre degistirirken,parametrelerin data type leri farkli ise yerleri degistirilebilir
3)Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir
  bu yüzden ismi ve parametre "Method Signature" olarak adlandirilir
4)Method overloadong olusturulurken return type i degistirmenin hicnir etkisi yoktur
Method overloadong olusturulurken acces modifier i degistirmenin hicnir etkisi yoktur
Method overloadong olusturulurken methodu static yyada non static yapmanin hicnir etkisi yoktur
Method overloadong olusturulurken body i  degistirmenin hicnir etkisi yoktur

5)"Private" method lar overlood edileblir . cünkü method overlooding sadace bir class icinde olur
private olmak ise baska class lara gidildiginde problem olur

6) static methodlar overload edilebilir,
overloading yapmak icin (method ismini degistirmeden) method signature i degistiririz,
dolayisiyla signature degistiginde yeni bir method olusturmus oluruz, bu nedenle static olmasi birseyi degistirmez





 */
}
