package day10ifstatements;

import java.util.Scanner;

public class HomeWork {
    //Kullanicidan 5 Katli bir daireden bir kat numarasi isteyin ve girilen her kat icin o katta
    //Oturan kisinin isim soismini konsola yazdirin

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kat numarasi yaziniz. . .");
        byte hausNumber = input.nextByte();


        if (hausNumber==1){
            System.out.println("Himmet Özman");
        } else if (hausNumber==2) {
            System.out.println("Tarik Ziya Özman");
        }else if (hausNumber==3) {
            System.out.println("Sedat Özman");
        }else if (hausNumber==4) {
            System.out.println("Saadet Özman");
        }else if (hausNumber==5) {
            System.out.println("Mavis Özman");
        }else{
            System.out.println("Kat sayisi bitti, Bu dairede oturan kimse yok");
        }

  /*
      Kullanicidan IT alanini bilgisini alarak co.nsole'a
      meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz
         */



    }














}
