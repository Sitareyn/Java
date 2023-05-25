package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
 //Example1: Ay isimleri girilince kacinci ay oldugunu yazan kkodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ismini giriniz");
        String MonthName= input.next();

        if(MonthName.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (MonthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        }else if (MonthName.equalsIgnoreCase("Mart")) {
            System.out.println(3);
        }else if (MonthName.equalsIgnoreCase("April")) {
            System.out.println(4);
        }else if (MonthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        }else if (MonthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        }else if (MonthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        }else if (MonthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        }else if (MonthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        }else if (MonthName.equalsIgnoreCase("Oktober")) {
            System.out.println(10);
        }else if (MonthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        }else if (MonthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        }else{
            System.out.println("Lütfen gecerli bir ay ismi giriniz");

        }


    }
}
