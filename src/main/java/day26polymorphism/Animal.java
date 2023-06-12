package day26polymorphism;

public class Animal {
    /*
    1)Parent Class daki methodu child class icinde özellestirerek kullanmaya overriding yapmak denir
    2)Overriding de method signature a dokunulmaz (method signature==>Method ismi+parantez,parametre)
    3)Private edilmis methodlar override edilemezler
    4)Child class daki methodun access modifieri parent class daki override edilmis 8Overriden Method un access modifier
    dar olamaz aynisi yada daha genis olur
    5)Child class inda override edilen methodun return type i ile parent daki
    return type arasinda "IS A RELATION ship" varsa return type degistirilebilir
     6) Methodun return typei primitive ise Overriding yaparken return type degistirilemez. Cunku return type ya ayni olur vyea
    parent tan secilir ama primitiveler arasinda Parent child iliskisi olmadiginidan aynisi olmak zorundadir
    7)Childda override edilen methodun return typei ile parent taki methodun return typei arasinda IS A Relation ship" yoksa return type
    DEGISTIRILEMEZ. Mesela;
    Integer wrapper classi ile Long wrapper classi arasinda IS A Relation ship" yoktur oyuzden degistirilemez
    8)Methodun return type i void ise Overriding yaparken return type degistirilemez
    9)Static methodlar Override edilemezler.Cünkü static methotlar tüm childler icin ortak methoddur.Bir child ortak method u
    degistirdiginde diger child ler bundan olumsuz etkilenebilir . bu yüzden Java
    static methodlarin override edilmesine müsaade etmez.
    10)Final method lar Override edilemezler.Final methodlarin bodysi degistirilemez ama override ederken
    method body ddegistiririz bu yüzden java final methodlarin override edilmesine izin vermez
        a)Final keywordunu variablelar ile kullanabilirirz
           i)eger varuable final ise mutlaka deger atanmalidir
           ii)ilk atanan deger degistirilemez
        b)Final keywordunu methodlar ile kullanabiliriz
           i)method final ise body si degistirilemez
           ii)degistirilelmeyince Override edilmek mümkün olmaz
        c)Final keywordunu class lar ile kullanabiliriz
             i)Class final ise child i olamaz

   Polymorphism =Method overloading +Method overriding

     */
    public void eat() {
        //Parentteki Override edilmis eat() methoduna Overriden Method denir
        System.out.println("Animals eat");
    }

    public void drink() {
        System.out.println("Animals drink");
    }

    public Animal create() {
        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public final double circleArea(double r) {
        return 3.14*r*r;
    }


}





