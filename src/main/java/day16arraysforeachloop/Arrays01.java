package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;
        //Bu yapinin icinde sadece bir data depolanabilir
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //Bir yapinin icine coklu data depolayabilme icin java array olusturmustur

        //Bie array olusturmak icin java ya hangi data type ni kulanacagimizi söylememiz gerekiyor
        //Array nasil olusturulur?

        String stdNames[] = new String[5];

        //Arraylar konsola nasil yazdirilir?
        //toString methodu kullanmadan sadece array ismi ile yazdiririrsaniz
        // java o array in sadece adresini yazdirir
        System.out.println(Arrays.toString(stdNames));

        /*
        Arrayler diger collectionlardan cok cok daha ihzlidir hatta buna (superfest)denir
        Arraylar diger collectionlardan daha az memory kullanirlar
         */
        //Array a eleman eklemesi nasil yapilir?
        stdNames[0] = "Benna";
        stdNames[1] = "Abdullah";
        stdNames[2] = "Recep";
        stdNames[3] = "Ekim";
        stdNames[4] = "Saadet";
        System.out.println(Arrays.toString(stdNames));

        //Spesifik bir eleman nasil alinir?

        System.out.println(stdNames[4]);
        // Örnek1) Array deki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz
        //lenght() stringlerde method(parantezli),arraylerde ise parantezsiz yazilir (Method degil)

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");


        }
    }
}