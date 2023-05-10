package day02datatypesmethodcreation;

public class MethodCreation01 {
  /*
  Java da method nasil olusturulur?
  1) main method un disinda class in icinde olusturulur
  2) ilk basta Access Modifier(erisim düzenleyici)+ return type+method ismi+()+  {}

  Olusturulan Methodlar masil kullanilir?
  1)Method u olusturmak , method u calistirmak icin yeterli degildir.Kullanilmak istenen Method
  main method un icinden kullanilir
  2)Method un ismi + () yazin
  varsa islem yapacaginiz datalari parantez icine koyun
  bu islem method call (method cagirma) olarak adlandirilir
  3)methodun ismi + parametreler ==> method signature
   */
  public static void main(String[] args) {
  int sonuc = toplamaYap(3,4);
  System.out.println(sonuc);
  long carpmaSonucu =  multiply(4,5);
  System.out.println(carpmaSonucu);

  System.out.println(firstTwoMultiplyThirdAdd (2,3,4) );
  }
  //Ornek1: Toplama islemi yapan bir method olusturunuz ve kullaniniz
    public static int toplamaYap (int a, int b){// bu kisimda method kapsasminda kullanilmasini ve islemesini istedigimiz datalari deklare ediyor
      return a+b;
      //return demek bu methodun cagrildigi yere geri döndür demek yani return et demek
     // main method static oldugu icin main method icinde kullandigimiz method static olmali

    }
//Ornek2) 2 sayiyi carpma islemi yapan bir method olusturun ve kullanin
    protected static long multiply (long a, long b ) {
        return a * b;
    }
//Ornek3) Verilen 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin
        private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
            return a * b + c;

    }


}
