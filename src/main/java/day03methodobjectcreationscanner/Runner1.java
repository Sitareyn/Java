package day03methodobjectcreationscanner;

public class Runner1 {
    public static void main(String[] args) {
        Teacher ögretmen = new Teacher();
        System.out.println( "isim"+  ögretmen.isim);
        System.out.println("yasi = " + ögretmen.yasi);
        System.out.println("brans = " + ögretmen.brans);
        System.out.println("deneyimYili = " + ögretmen.deneyimYili);
        ögretmen.teach();
        ögretmen.beceri();
        ögretmen.takip();
        ögretmen.kolay();
    }
}

