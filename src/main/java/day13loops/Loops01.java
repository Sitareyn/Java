package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //Ekrana 5 kere "Hi" yazdirin.

/*
Code Standarts
  1)Tekrar(Repetition) olmamalidir
  2)Dynamic olmalidir
  3)Tamir(fix) ve uptade kolay yapilabilmelidir
  */
        //2.Yol:
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir
        //Dort tane loop vardir 1)for-loop 2)while-loop 3)do-while-loop 4)for-each-loop

        //1) for-loop
      //  for ( Baslangicdegeri  ;   Loop calisma sarti;   Artirma/eksiltme){
        //  calisacak kodlat (sout)}

        for (int i =1 ;  i<=5  ;i++ ){   //i<6 da yazilabilir 6 yi dahil etmez 5 kez yazdirir
            System.out.println("Hi..");
        }

        //Örnek2) 11 den 14 e kadar tüm tamsayilari ekrana yazdirin..

        for (int i =11 ; i<15 ; i++){
            System.out.println("i");
        }
        //40 dan 23 e kadar tüm cift sayilari ekrana yazdirin

        for(int i =40; i>22 ; i--) {

            if (i % 2 == 0) {

                System.out.println(i);

            }
        }

        //18 den 56 ya kadar tek sayilar

        for (int i=18 ; i<57 ; i++){
            if (i%2==1){
                System.out.print(i+" ");

            }
        }




    }
}
