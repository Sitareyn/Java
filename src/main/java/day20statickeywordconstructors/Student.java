package day20statickeywordconstructors;

public class Student {
    /*
    1)Static variable veya static method'lar (class member) tüm objectler icin ortak elemandir
    2)Static class memberler üzerinde yapilan tüm degisiklikler tüm obje leri etkiler
    3)static class memberler Class a non-static class memberlar objectlere monte edilir
    Mesela ; bir classs dan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
    ama non-static olanlar oject sayisindan bagimsiz olarak bir kere olusturulurlar
    4)Static class memberlara ulasmak icin object olusturmaya gerek duyulmaz,
    ama non-static class memberlara ulasmak icin object olusturmak sarttir
    5) Static variablelar in diger adi (Class Variable) dir .
    Non-static lerin diger adi "Instance Variable" veya "Object Variable" dir.
     */


public static String stdName = "Tom Hanks";   // basinda static olmadan Instance Variable dir

public int age =13;

public static void staticMethod(){
    System.out.println("Ben static Methodum");
}

public void nonStaticMethod(){
    System.out.println("Ben static olmayan methodum");
}




}
