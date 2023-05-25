package day10ifstatements;

import java.awt.*;
import java.util.Scanner;

public class HomeWork02 {
    // Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //1==> January, 2 ==> February ..... */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ay sayisi giriniz...");
        int montsNumber = scan.nextInt();


        if (montsNumber == 1) {
            System.out.println("January");
        } else if (montsNumber == 2) {
            System.out.println("February");
        } else if (montsNumber == 3) {
            System.out.println("March");
        } else if (montsNumber == 4) {
            System.out.println("April");
        } else if (montsNumber == 5) {
            System.out.println("May");
        } else if (montsNumber == 6) {
            System.out.println("June");
        } else if (montsNumber == 7) {
            System.out.println("July");
        } else if (montsNumber == 8) {
            System.out.println("August");
        } else if (montsNumber == 9) {
            System.out.println("September");
        } else if (montsNumber == 10) {
            System.out.println("October");
        } else if (montsNumber == 11) {
            System.out.println("Novemeber");
        } else if (montsNumber == 12) {
            System.out.println("December");
        } else {
            System.out.println("Lütfen gecerli bir ay sayisi giriniz. . .");


        }


    }
}
