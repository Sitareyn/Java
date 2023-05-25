package day15loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Alistirmalar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu görmek icin bir sayi giriniz");
        int num = input.nextInt();

        int i = 1;           // 9    x    2     =  18
        while (i<11) {       // 9    x    1     =  9
            System.out.println(num+ "x" + i + " = "+ (num*i));
            i++;

        }

        // verilen kelimenin her harfinin yanina * koyunuz

        System.out.println("Bir kelime giiriniz");
       String word = input.next();

       String newWord ="";

       int k = 0;

       while(k< word.length()){

         newWord=newWord+ word.charAt(k)+"*";

           k++;
       }
        System.out.println(newWord);






    }



}
