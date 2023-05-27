package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Örnek 1: String bir array olisturun icine 5 eleman olusturun
        // ilk ile son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin

        String arr []= new String [5];
         arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";






    //Örnek2)String bir eleman olustuurn 5 eleman olusturup tüm elemanlarin karakter sayisini toplayin

     String brr [] = new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";

        //1.Yol for loop

        int totalChar=0;

        for (int i = 0; i < brr.length; i++) {

          totalChar=totalChar+brr[i].length();


        }
        System.out.println(totalChar); //30

        //2.Yol: for each loop (enhanced loop)
        //baslangic degeri,loop un calisma sarti ve increment/decrement kismini kendisi haleder
        // for each loop sadece "Array'lerde ve 'Collection'larda kullanilir

      /*  Kalibini olusturalim

        for (DataType  w :arr/collection   ){
            calisacak kodlar
        }
        */
        int sum =0;

        for (String w : brr){
            sum=sum + w.length();

        }
        System.out.println(sum); //30

        //Örnak3: Notlr adinda Integer bir Array olusturunuz icine 6 tane not yerlestirin ve nnot ortalamasini iste

        int notlar[] = new int [6];

        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;
        System.out.println(Arrays.toString(notlar)); //[50 ,70 ,60, 40 , 90, 80]

        int toplam=0;

        for (int w: notlar){

            toplam=toplam+w;
        }
        System.out.println(toplam/notlar.length);   //65


    }
}
