package day04scannerwrapper;

import org.w3c.dom.ls.LSOutput;

public class WrapperClass {

    public static void main(String[] args) {
        //Primitive :char-boolean-byte-short-int-long-float-double
  //Wrapper Class: Character-Boolean-Byte-Short-Integer-Long-Float-Double
  //Wrapper Class lar non-primitive dir. Bundan dolayi memmory de cok yer kaplarlar.dolayisiyla sart
  //olmazsa Wrapper Class kullanmayi tercih etmeyiz ama var oldugunu biliriz
   // n yazip nokta koyarsaniz hic method göremezsiniz cünkü primitive ler method icermez
   int n =12;

   //m yazip nokta koyarsaniz bircok method görürsünüz cünkü Wrapper Class lar method icerir
   Integer m =12 ;

   //Örnekler

        byte p = 33;
        Byte r = 44;
        //Short data type nin min ve max degerlerini kod yazarak bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);
//int data type nin min degeri ile byte data type nin max degerinin toplami?
        int intMin = Integer.MIN_VALUE;
        byte byteMax= Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);

        //Primitive int i wrapper Integar a ceviriniz
        int num = 12;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        //ornek4: Wrapper Byte i primitive byte a ceviriniz
        Byte k =12;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Primitive

        char b = 'B';
        Character wrapperB= b ;

        Boolean isOldWrapper = true;
        boolean isOldPrimitive =isOldWrapper;

    }


}
