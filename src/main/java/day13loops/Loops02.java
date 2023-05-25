package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 2 hem de 3 ile tam bölünebilen tam sayilari ekrana yazdiran kodu yazdiriniz

for (int i = 21 ; i<181 ;i++){
if (i%2==0 && i%3==0){
    System.out.println(i+" ");
}
}
 //Örnk2) size verilen kücük harf iile yazilmis stringin indexi cift sayi olan karakterleri büyük harf ile yazdirin
        // ankara ==>AKR
        String s = "ankara";
               //i<=s.lenght()-1
for (int i = 0 ; i<s.length(); i++){
String ch = s.substring(i,i+1);
    if (i%2==0){
        System.out.println(ch.toUpperCase());
    }

}
//Örnk3) Verilen bir Stringde ilk A harfinden önceki tüm karakterleri konsola yazdiriniz
        //"I love Java" ==> "I love J"

        String s1 = "I love Java";

     for ( int i =0; i<s1.length() ; i++){

         if (s1.charAt(i)=='a'){
             break;
         }
        System.out.println(s1.charAt(i));
        }

//Ornek4) Verilen  bibr stringde son a dansonraki tüm karakterleri ters sirada yazdirirniz
        String t ="Germany";
     for (int i =t.length()-1 ; 1>0 ; i--){
         if (t.charAt(i)=='a'){
             break;
         }
         System.out.println(t.charAt(i));
     }




    }
}
