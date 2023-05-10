package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //Obje nasil olusturulur?
        //New keywordu sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur.
        //class ismi + Obje ismi + Assigment operator + "new" keywordu + Cconstructor
           Car           myCar          =                    new          Car();
        System.out.println("myCar.fiyat= " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

Student aliCan = new Student();

System.out.println("aliCan.name = " + aliCan.name);
System.out.println("aliCan.adress = " + aliCan.adress);
System.out.println("aliCan.grade = " + aliCan.grade);
aliCan.study();
aliCan.feed();





    }
//homework
    //icinde isim ve yas variablesi olsun teach methodu bulunan bir Teacher object olusturun ve obje uzerinde bu ozellikleri(runnerde) kullanini

}

