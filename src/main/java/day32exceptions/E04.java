package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class E04 {

        /*
        Exceptionlar ikiye ayrilir
         1)Compile Time     2)RunTime
   1)Run butonuna bastiktan sonra konsolda görünen exception lara "RunTime Exception"denir
   AritmeticException,NullPointerException,NumberFormarException,ArrayIndexOutOfBoundsException,
   StringIndexOutOfBoundException===> RunTimeExceptionlara örnektir.
   RunTime Exceptionlara "Unchecked Exception" da denir.Kelime manasi "kontrol edilmemis" tir.
   2)Code yazarken kirmizi alt cizgi seklinde alinan Exception lar da vardir.Bunlara da "Compile Time Exception" denir.
   FileNotFaundException, IOException comple time exception lara ornektir
        Compile Time Exception lara Checked Exception da denir

        Throw ile Throws keyword leri arasindaki fark nedir?
        1) throw method body si icinde throws ise method parantezinden hemen sonra kullanilir
        2) throw method body si icinde istenilen yerde istenildigi kadar kullanilir.
             throws ise method parantezindne hemen sonra sadece bir kere kullanilabilir.
        3) throw dan sonra new keyword ve constructor kullanilarak obje olusturulur
             throws dan sonra sadece exception class ismi yazilir.
        4) throw belli sartlar icin exception firlatmada kullanilir
             throws ise bir meethodun belli bibr exception i firlatabilecegini belirtmek icin kullanilir.



     */
        public static void main(String[] args) throws IOException,FileNotFoundException {

            FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");

            int k =0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);

            }

        }
}
