package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ornek 1 : Integer bit arrray olusturun icine 6 tane eleman yerlestirin
        //Bu elemanlarin en kücügü ile en büyügünün toplamini ekrana yazdirin

        int ages[] = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages)); //[20, 23 , 19, 44 ,15 ,32]

        //En kücük ve en büyük bulmak icin önce kücükten büyüge siralama yapilir

        //1.Yol
        //sort() "dizmek anlamina gelir" sort methodu array daki elemanlari kücükten büyüge dizer

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages)); //15- 19-20-23-32-44

        System.out.println(ages[0]+ ages[ages.length-1]); //59
       // bu da olur: int sum =ages[0]+ages[ages.length-1];
       //                  System.out.println(sum);

        //2.Yol

        int minimum= ages[0];

        for (int w : ages){
            //15- 19-20-23-32-44

            minimum= Math.min(minimum,w);


        }
        System.out.println(minimum); //15

        //Örnek2:
        //String bir array olusturunuz 6 eleman ekleyiniz ve yellow dan önceki elemanlari yazdiriniz

        String colors [] = new String [6];

        colors[0]= "Red";
        colors[1]= "Orange";
        colors[2]= "Blue";
        colors[3]= "Yellow" ;
        colors[4]= "Green";
        colors[5]= "Braun";

        for (String w: colors){

           if (w.equals("Yellow")){
             break;
            }
            System.out.println("w = " + w);
        }



    }
}
