package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {
        //Örnek
        int a = 10;
        int b =20;

        int r1 = a<b ? a++ : ++b;

        System.out.println("r1 = " + r1);
        System.out.println(a);
        System.out.println(b);

        //Örnek 2) Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //  -4 ==> -1*-4                  4==>4   0==>0

        int c = -4;
        int r2 = c < 0 ? -1*c : c;

        System.out.println(r2);

        //Örnek3)iki sayinin isareti ayni ise carpan, isaretleri farkli ise"Farkli sayidaki sayilai
        //carpamiyorum mesajin veren kodu yaziniz.

        int m=5;
        int n=-6;
        Object r3 =(m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

       //Örnek4) Bize verilen sayinin üc basamakli olup olmadigini kontrol eden kodu yaziniz

        int p = -133;
        p= Math.abs(p);

        String r4 = p>99 && p<1000 ? "Üc basamaklidir" : "Üc basamakli degildir";
        System.out.println("r4 = " + r4);




    }
}
