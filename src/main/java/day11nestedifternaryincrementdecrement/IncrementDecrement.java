package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Increment 2
        int d = 6 ;
        System.out.println(d);   //6
        d=d*2;
        System.out.println(d);   //12
        d*=2;
        System.out.println(d);   //24

        //decrement2
        int e =24;
        System.out.println("e = " + e); //24
        e=e/2;
        System.out.println("e = " + e); //12
        e/=2;
        System.out.println("e = " + e); //6


        //"1" ile increment
        int f =12 ;
        //f=f+1;
        //f+=1;
        f++;
        System.out.println("f = " + f);

        //"1" ile Decrement

        int h =10;
        //h=h -1;
        //h-=1;
        h--;
        System.out.println("h = " + h);

        //"Post-increment" ve "pre-increment   (Post :sonra  pre: önce demek
        int i =10;
        int k = i++;
        System.out.println(i);
        System.out.println(k);

        int m = 15;
        System.out.println(m);
        int n = ++m;
        System.out.println(n);

        /*
       1) Increment artirmak demektir.decrement azaltmak demektir
       2)Increment toplama ve carpma ile, decrement cikarma ve bölme ile yapilir
       3)Increment
              a)i=i+5;
              b)i+=5;
              c)Eger 1 ile artirma söz konusu ise  o zaman i--; tavsiye edilir
         */

        //Ornek
        int p = 17; //16 olur
        int r = p--; //17 olur

        //Ornek2
        int s = 20; //19
        int t = --s; //19



    }
}
