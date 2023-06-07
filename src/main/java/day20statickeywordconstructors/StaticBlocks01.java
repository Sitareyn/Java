package day20statickeywordconstructors;

public class StaticBlocks01 {
    //Bor variable olusturdugumuzda deger atamaysak o variable yi "Initialize(baslatmak)" etmedik anlamina gelir
    static double pi;
    static String shape;

     // Bazen main method calistirilmadan önce Variable larin hazir hale getirilmesi gerekir
    //Bu yüzden StaticBlock lar kullanilir
   //Static Variable ler static blocklar icinde Initialize edilirse o class in icinde
  // her seyden önce hazir hale getririlmis olur
    //Birden fazla StaticKeywordu olursa yukarida yazilan ilk yazilir

    static {
    pi=3.14;
        System.out.println("StaticBlock 1");
    }


static {
        shape="Circle";
    System.out.println("Static Block 2");
}


    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("Main Method");

    }


}
