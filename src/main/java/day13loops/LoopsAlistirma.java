package day13loops;

import java.util.Scanner;

public class LoopsAlistirma {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.


        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + "x" + j + "= " + (i * j));
            }
            System.out.println("\n");
        }

        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aldiginiz ürünün sayisini giriniz");
        int adet = input.nextInt();
        System.out.println("Lütfen aldiginiz ürünün liste fiyatini yaziniz");
        double fiyat = input.nextDouble();
        System.out.println("Müsteri kartiniz var mi? (evet/hayir)");
        String kart = input.next();

        double indirim;
        double ödeme;

        if (kart.equalsIgnoreCase("evet")){

        }if (adet>10){
            indirim=fiyat*0.20;
            ödeme=fiyat-indirim;
            System.out.println(ödeme*adet);
        } else if (adet<10) {
            indirim=fiyat*0.15;
            ödeme=fiyat-indirim;
            System.out.println(ödeme*adet);
        }if (kart.equalsIgnoreCase("hayir")) {

        } else if (adet>10){
            indirim= fiyat*0.15;
            ödeme=fiyat-indirim;
            System.out.println(ödeme*adet);
        } else if (adet<10) {
            indirim=fiyat*0.10;
            ödeme=fiyat-indirim;
            System.out.println(ödeme*adet);
        }else{
            System.out.println("Lütfen gecerli komut giriniz!!");
        }


    }
}

