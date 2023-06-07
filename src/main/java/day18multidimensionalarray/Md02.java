package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {

        String students [][]= { {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        //Yukarida ki student array inda icerisinde "m" olan isimleri console a yazdiriniz

        for (String[] w : students) {

            for (String k:w) {
                if (k.contains("m")){
                    System.out.println(k);
                }
            }

//Örnek2) Bir Integer multidimensional array olusturunuz , tüm elemanlarin carpimini hesaplayiz
        }


int nums [][]={{5,4},{2,3,2},{7}};

       int sum1= 1;
        for (int[] w : nums) {
            for (int k : w ) {

              sum1 = sum1*k;
            }
        }
        System.out.println(sum1);








    }
}
