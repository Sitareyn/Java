package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Örnek1) Bir string in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yazin
       //1.yol length() methodu ile cözüm
        String str = "";

        boolean result1 = str.length()==0;
        System.out.println("String bos mu = " + result1); // String bos mu ? TRUE

        //2.yol
        //Eger Java bir konuda method olusturmussa o methodu kullanmak daha iyidir
        boolean result2 = str.isEmpty();
        System.out.println("isEmpty = " + result2); //isEmpty? true

        //Örnek2) Bir Stringin space haric hicbir karakter icermedigini kontrol eden kodu yaziniz
        String t= "    ";
        //1.Yol
        boolean result3=t.replace(" ","").length()==0;
        System.out.println("result3 = " + result3);
        //2.Yol
        boolean result4=t.replace(" ","").isEmpty();
        System.out.println("result4 = " + result4);

        //3.Yol
        boolean result5=t.isBlank();
        System.out.println("result5 = " + result5);
        //IsBlank() methodu sadece space iceren Stringler icin true verir,space disinda bir character var ise false verir
        // IsBlang() methodu bos Stringler icin de true verir
        //isEmpty() methodu sadece hic birsey icin true verir

        //Örnek3) Bir String de a, i , e characterlerinin ilk görünümlerinin indexleri toplamini ekrana yazdirin
        //"Java is easy to learn" ==> 1+5+8=14

        String  r ="Java is easy to learn";
        int idxA =r.indexOf('a');
        System.out.println("idxA = " + idxA); // 1

        int idxI =r.indexOf('i');
        System.out.println("idxI = " + idxI); // 5

        int idxE =r.indexOf('e');
        System.out.println("idxE = " + idxE); // 8

        System.out.println(idxA +idxI+ idxE); //14

        //Örnek4) Bir stringdeki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gösteren kodu yaziniz
        //Ah Java vah Java aensiz olmuyor Java
        //IndexOf("Java") kullaniminda siz Java kelimesinin ilk görünümündeki ilk harfin (yani J nin) indexini almis olursnuz

        String u = "Ah Java vah Java sensiz olmuyor Java";

        int idxJava= u.indexOf("Java");
        System.out.println("idxJava = " + idxJava); //3


        // indexOf methodu olmayan karakterler icin kullanilirsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println("idxjava = " + idxjava); //-1

        //Ornek5) Bir String de a, i , e characterlerinin son görünümlerinin indexleri toplamini ekrana yazdirin

        String v= "Java is easy to learn";
        int idxOfa =v.lastIndexOf('a');
        System.out.println("idxOfa = " + idxOfa);//18

        int idxOfe = v.lastIndexOf('e');
        System.out.println("idxOfe = " + idxOfe); //17

        int idxOfi = v.lastIndexOf('i'); //5
        System.out.println("idxOfi = " + idxOfi);

        System.out.println(idxOfa+idxOfe+idxOfi);







    }
}
