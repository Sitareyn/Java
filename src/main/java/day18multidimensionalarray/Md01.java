package day18multidimensionalarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Bir array in elemanlari array ise , bu Array ler Multidimensional Array dir
        //Multidimensional Array nasil olusturulur?

                                                    //  0  -   1   -   2    (index sayisi)
        int a [][] = new int[3][2];   //sintex budur [[5,12],[81,45],[123,0]]

        //Multidimensional Array lere eleman nasil eklenir?

        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //nasil yazdirilir?
        System.out.println(Arrays.toString(a)); //[[I@49e4cb85, [I@2133c8f8, [I@43a25848]
        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]]

        //Multidimensional arrayleri console a yazdirmak icin "toString()" methodu degil
        //"deepToString()" methodunu kulanmaliyiz.

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir
        System.out.println(a[1][1]); //45
        System.out.println(a[2][1]); //0

        //Multidimensional Array icindeki bir array nasil yazdirlir
        System.out.println(Arrays.toString(a[0])); // [5,12]

        //Kisa yoldan Multidimensional array nasil olusturulur
String students [][]= { {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

//Örnek 1 : Yukaridaki students array in de kac isim moldugunu bulunuz.
     int sum = 0;
        for (String[] w:students) {
            sum=sum+w.length;
        }
        System.out.println(sum);





    }
}
