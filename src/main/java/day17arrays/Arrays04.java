package day17arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Örnek1: Size verilen bir cümlede kac kelime oldugunu gösteren kodu yaziniz

    String s ="Java is easy . Learn Java earn money";

    String words[] = s.split(" ");
        System.out.println(Arrays.toString((words))); //Java,is,easy,learn,java,earn,money
        System.out.println(words.length); //7

        //Örnek2) Size verilen bir cümlede kac harf oldugunu gösteren kodu yazin
       String letters[] = s.replaceAll("^a-zA-Z", "").split("");

        System.out.println(Arrays.toString(letters)); //J,a,v,a,i,s,e,a,s,y,L,e,a,r,n,J,a,v,a,e,a,r,n,m,o,n,e,y
        System.out.println(letters.length); //28





    }
}
