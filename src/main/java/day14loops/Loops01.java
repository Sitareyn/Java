package day14loops;


//Interwiew sorulari iyi calis tekrar et

public class Loops01 {
    public static void main(String[] args) {
        //Örnek:Stringi ters ceviren kodu yazdirin
        //Java ==> avaJ

  //1.yol

        String t ="Java";
        String ters = "";
        for (int i =t.length()-1; i>=0 ; i--){

          ters= ters +t.substring(i,i+1);

        }
        System.out.print(ters);


        //2.Yol

        String u = "Java";
        String ters2= "";

        for (int i =u.length()-1 ; i>=0 ; i--){
           ters2 =ters2 + u.charAt(i);
        }
        System.out.println("ters2 = " + ters2);


        //Size verilen bir String in palindrome olup olmadigini kontrol eden kodu yaziniz.
          // palindrom==> ey edip adanada pide ye
        // Logic :String i ters cevir sonra da düz hali ile karsilastir ayni ise Polindrome dur

        String duz = "ey edip adanada pide ye";
        String ters3 = "";

        for (int i = duz.length()-1; i>=0 ; i--){
            ters3=ters3 + duz.charAt(i);
        }
        System.out.println("ters3 = " + ters3);
        if (duz.equalsIgnoreCase(ters3)){
            System.out.println("Palindrome dur");
        }else{
            System.out.println("Palindrome degildir");
        }






    }
}
