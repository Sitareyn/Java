package day02datatypesmethodcreation;



public class Tekrar01 {
// ödev: iki kardesin yaslari icin iki variable olusturup toplayarak yazdirin
public static void main(String[] args) {
    byte sister = 13;
    byte brother = 17;
    System.out.println(sister+brother);

    int alan = alanHesapla (5,10);
    System.out.println (alan);
    long cevre = cevreHesapla (5, 10);
    System.out.println(cevre);
}
public static int alanHesapla (int a, int b) {
    return (a * b);
}
public static long cevreHesapla (int a, int b) {
    return (a+b)*2;
}

}
