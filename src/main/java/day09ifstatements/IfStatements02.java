package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
  //Kullanicidan alinan bir sayinin tek mi cit mi oldugunu konsola yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz. . .");
        int num =input.nextInt();

        //1.Yol
        if(num%2==0){                                       //Birinci yolda kontrol edilen condition sayisi 2 dir
            System.out.println("Cift sayidir..");
        }
        if(num%2!=0){
            System.out.println("Tek sayidir");
        }

        //2.yol)
        if(num%2==0){
            System.out.println("Cift sayidir");
        }else {                                           //Ikinci yolda kontrol edilen condition sayisi 1 dir
            System.out.println("tek sayidir");             //else (aksi halde) demektir. ilk condition false ise hemen else a bakar

        }







    }
}
