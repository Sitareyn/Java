package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //Örnek) Iki boyutlu bir Array i tek boyutlu bir array e ceviriniz


        int number [][]= {{5,4},{2,3,2}};

        //1,adim:2 boyutlu Array de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi= 0;
        for (int[] w : number) {
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }

        System.out.println(toplamElemanSayisi);
        //2.adim: Tek boyutlu arra i iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz
        int newArr[]=new int[toplamElemanSayisi];

        //3.adim: iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz
        int idx =0;
        for (int[] w :number) { //Outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz

            for (int k : w ) { // Inner loop ile w sepetine koymus oldugumuz array in elemanlarini tek tek aliriz
                newArr[idx]=k; //Yeni olusturmus oldugumuz array e index kullanarak atama yapiyoruz
                idx++; //Bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }

        System.out.println(Arrays.toString(newArr));















    }
}
