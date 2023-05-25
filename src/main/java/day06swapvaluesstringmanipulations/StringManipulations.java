package day06swapvaluesstringmanipulations;

public class StringManipulations {
    public static void main(String[] args) {
    //String bir non-primitive datatype dir ayni zamanda bir class tir.
    String s = "Java is easy";

    //Örnek1: "s" Stringindeki tüm karakterleri büyük harf yapiniz

     String sUpper = s.toUpperCase();
     System.out.println("sUpper = " + sUpper); // JAVA IS EASY

    //Örnek2:
    String sLower = s.toLowerCase();
    System.out.println("sLower = " + sLower); // java is easy

        //Ornek3: "s" stringindeki ilk karakteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println("firstChar = " + firstChar);
        
    //Ornek4="s" stringdei ikinci ve sondan ikinci karakteri aliniz
       char secondChar =s.charAt(1);
       char secondLastChar=s.charAt(10);
        System.out.println(secondChar);
        System.out.println(""+secondChar + secondLastChar);

    //Ornek5= "s" stringinde kullanilan character sayisini bulunuz

       int sLength = s.length();
        System.out.println("sLength = " + sLength);
    //Örnek5= "s" Stringindeki ilk 4 karakteri aliniz

     //s.substring==> bu kullanimda ilk index dahildir ,ikinci index harictir
        String sub1= s.substring(0,4);
        System.out.println("sub1 = " + sub1);

        //Ornek6)s deki  is yazisini yazdir

        String sIS =s.substring(5,7);
        System.out.println("sIS = " + sIS);

        //Ornek7)
       String sEND =s.substring(8,12);
        System.out.println("sEND = " + sEND);

        //2.Yol:
      //Ornek8)
        String sUB4 = s.substring(2); //sonuna kadar alir
        System.out.println("sUB4 = " + sUB4);

        //Ornek9)

        //"s" stringinde money kelimesinin var olup olmadigini kontrol ediniz

        boolean isExist= s.contains("money");
        System.out.println("isExist = " + isExist);

        //Örnek10) "s" String inin belli bir harfle baslayip baslamadigini kontrol edin
         boolean isStars = s.startsWith("Java");
        System.out.println("isStars = " + isStars);

        //Ornek11) "s"Stringinin 5. index dahil olmak üzere bu inexten itibaren "i" karakteri ile
        // baslayp baslamadigini kontrol ediniz

       boolean isIndex = s.startsWith("i", 5);
        System.out.println("isIndex = " + isIndex);

        //Ornek 12 )
        boolean isIndex2 = s.startsWith( "v", 2);
        System.out.println("isIndex2 = " + isIndex2);

        //Ornek13)


    }
}
