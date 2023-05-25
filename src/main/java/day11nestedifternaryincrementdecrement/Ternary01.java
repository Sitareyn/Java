package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Ternary = güclü anlamina gelir
        //Örnek1)Sayi 10 dan kücük ise konsola kücük yazdirin, degil ise kücük degil yazdirin
        //...........If else cözümü.........
        int num =12;
        if (num<10) {
            System.out.println("Kücük");
        }else{
            System.out.println("Kücük degil");
        }
        //.........Ternary cözümü........
              //Conditon   ?  Conditon true ise calisir :  Conditon false ise calisir
 String sonuc = num<10    ?        "Kücük"             :       "Kücük degil"        ;

           System.out.println(sonuc);

       //Örnek2) Sayi cift ise konsola cift tek ise tek yazdirin

        int num1 =3;

      String sonuc1=  num%2==0 ? "Cift" :   "Tek " ;

        System.out.println(sonuc1);

        //Örnek3)Sayi sifirdan büyükse pozitif degilse pozitif degil yazdirin

        int num2 =-5;
        String sonuc2 = num2>0?  "Pozitif" : " Pozitif degil";
        System.out.println(sonuc2);


        //Ornek 4 Kullanicidan iki sayi aliniz (Büyük olmayan kücük veya esit olan sayiyi yazdirin
        Scanner input =new Scanner(System.in);
        System.out.println("iki sayi girirniz");

        double first = input.nextDouble();
        double second = input.nextDouble();

        //1.Yol If else cözümü

        if (first<second) {
            System.out.println(first);
        }else{
            System.out.println(second);
        }

        //Ternary cözümü

         Double sonucc= first<second ? first : second ;
        System.out.println(sonucc);
    }
}
