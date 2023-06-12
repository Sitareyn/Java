package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static <LokalTime> void main(String[] args) {
        //Anlik zaman nasil alinir
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //20:02:26.589267700

//Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);


        int nano = myCurrentTime.getNano();
        System.out.println(nano);


//Gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);


        //Zaman formati nasil degistirilir??
    /*
    DateTime class da kullanilan tarih saat formatlari
    HH : mm ==> 24 lü saat sistemi
    hh : mm ==> 12 li saat sistemi
    hh: mm a ==> 12 li saat sistemi , AM , PM gösterilir
    HH : mm : ss  ==> 24 lü saat sistemi (saniyeli)
    HH :MM ==> Yanlis format MM aylar icin kullanilir
     "mm" minute demktir . "MM" month demektir

 dd-MM-yyyy==> gün ay(rakam ile) yil
    MMM ==> Aug
    MMMM==> August
*/

      DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("HH : mm");


      String  formatteMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formatteMyCurrentTime);

        //Date formati nasil degistirilir?
        LocalDate myDate =LocalDate.of(2023,8,13);
        System.out.println(myDate); //2023-08-13


        //Tarihi ay/gün/yil sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatteMyDate = dtf2.format(myDate);
        System.out.println(formatteMyDate); // 08/13/2023


//Tarihi  gün ay isminin ilk uc harfi yilin ilk iki rakami

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern(" dd/MMM/yy");
        String formatteMyDatem = dtf3.format(myDate);
        System.out.println(formatteMyDatem);
//Tarihi  gün ay isminin tamami uc harfi yilin tamami
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatteMyDate2 = dtf4.format(myDate);
        System.out.println(formatteMyDate2);
   //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz?
       LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

       //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo da saat kac?
       LocalTime timeInTokyo= LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

       //Amsterdam da saat kac?
        LocalTime timeInAmsterdam= LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);

    }

}
