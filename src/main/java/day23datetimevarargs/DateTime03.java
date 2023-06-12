package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2023-06-10T21:26:30.338337400


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy  hh:mm");
         String formattedLdt =dtf.format(ldt);
        System.out.println(formattedLdt);



    }
}
