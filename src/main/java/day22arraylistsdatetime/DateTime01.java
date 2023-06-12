package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class DateTime01 {
    public static void main(String[] args) {

        //Icinde bulundugumuz zaman diliminddeki tarihi nasil aliriz?

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);  //2023-06-07

        //Tarihden istedigimiz bileseni nasil aliriz?
       int monthValua= myCurrentDate.getMonthValue();
        System.out.println(monthValua); // 6

       int yearValua = myCurrentDate.getYear();
        System.out.println(yearValua);   // 2023

       int dayValua = myCurrentDate.getDayOfMonth();
        System.out.println(dayValua);

//Month bir enum dir. Enum bir depodur (icinde degismez datalarin bulundugu bir depo)
        //Enum java da sabit degerler(Ay isimleri.Gün isimleri,Ülkedeki sehir isimleri)
        // depolamak icin kullanilan bir yapidir
       Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName); //JUNE
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName); //WEDNESDAY

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));
          //2026-08-12

        //Gecmis tarihe nasil gidirlir?
        System.out.println(myCurrentDate.minusYears(20).minusMonths(2).minusDays(5));
         //2003-04-02

        //Specific bir tarih object i nasil olusturulur?
        LocalDate date1 =LocalDate.of(1990,8,10);
        LocalDate date2 =LocalDate.of(1980,8,10);

    //Bir tarihin bir tarihten sora olup olmadigini nasil kontrol ederiz
        boolean r1 =date1.isAfter(date2);
        System.out.println(r1); //True
        //
        boolean r2 =date1.isBefore(date2);
        System.out.println(r2); //False

       boolean r3 = date1.isEqual(date2);
        System.out.println(r3);



//Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz


        Scanner input =new Scanner(System.in);
        System.out.println("Please enter year,month and day numbers in the given order");

        int year =input.nextInt();
        int month=input.nextInt();
        int day =input.nextInt();

        LocalDate givenDate =LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + "invalid date");
        }else {
            System.out.println("Enter time for the ticket");
        }
        //Example 2: Kullanicinin girdigi tarihin gün ismini bulan kodu yaziniz
        System.out.println("Please enter year,month and day numbers in the given order");

        int y = input.nextInt();
        int m=input.nextInt();
        int d =input.nextInt();
        LocalDate date = LocalDate.of(y,m,d);

        System.out.println(date.getDayOfWeek());

    }
}
