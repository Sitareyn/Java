package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

//Sayi üc basamakli ise ekrana sayi üc basamaklidir yazdirin
   //Örnek1)
        //
        int number = -123;
        number = Math.abs(number);   //abs methodu -123 ü pozitif 123 yapar.

        if(number>99 && number<1000){
            System.out.println("Sayi üc basamaklidir");
        }
//Örnek2)Bir stringdeki tekrarsiz karakterleri ekrn yazdiriniz
        //abbccdc ==> ad

        String str = "aac";

        char ch1 =str.charAt(0);
        if(str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println("ch1 = " + ch1);
        }


        char ch2 =str.charAt(1);
        if(str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println("ch2 = " + ch2);
        }

        char ch3 =str.charAt(2);
        if(str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println("ch3 = " + ch3);
        }












    }




}
