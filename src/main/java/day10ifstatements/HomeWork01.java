package day10ifstatements;

import java.util.Scanner;

public class HomeWork01 {
   /* Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
            //ve kullaniciya uygun mesaj veren kodu yaziniz

            2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
      Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
     1==> January, 2 ==> February ..... */

    public static void main(String[] args) {
  //Ödev1)
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Password'unuzu giriniz");
        String sifre = input.nextLine();

        if (sifre.equalsIgnoreCase("pwd123!")){
            System.out.println("Gecerli Parola");

        }else{
            System.out.println("Gecersiz parola");
        }
  //Ödev2) 2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
        //      Pazar ==> 1.gün , Pazartesi  ==> 2.gün

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir Hafta ismi giriniz");
        String weekName = scan.next();


        if (weekName.equalsIgnoreCase("Pazar")) {
            System.out.println(1);

        } else if (weekName.equalsIgnoreCase("Pazartesi")) {
            System.out.println(2);
        }else if (weekName.equalsIgnoreCase("Sali")) {
            System.out.println(3);
        }else if (weekName.equalsIgnoreCase("Carsamba")) {
            System.out.println(4);
        }else if (weekName.equalsIgnoreCase("Persembe")) {
            System.out.println(5);
        }else if (weekName.equalsIgnoreCase("Cuma")) {
            System.out.println(6);
        }else if (weekName.equalsIgnoreCase("Cumartesi")) {
            System.out.println(7);
        }else{
            System.out.println("Lütfen gecerli bir gün adi giriniz");
        }


    }











}
