package day13loops;

public class loops03 {
    public static void main(String[] args) {
        //Örnek1) Verilen bir String de kücük harfleri console a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
    String s = "Pwd12?Ab";
    for ( int i =0  ; i < s.length()  ; i++ ){

        char ch =s.charAt(i);
        if (ch>='a' && ch <='z') {
            continue;
        }
        System.out.println(ch);

    }
// "Break" ile "continue" arasindaki fark nedir
//"Break" switch in disina cikmak icin ve loop u kirmak icin kullanilir
//Continue ise loop yaparken bazi elemanlari isleme sokmamak icin kullanilir
//continue keywordu bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta goturur







    }
}
