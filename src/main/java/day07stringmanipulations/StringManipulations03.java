package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {

        //Ornek1: Bir string in bas ve sonunda space characteri varsa siliniz
        // "      Ali Can  " ==> "Ali Can

        String s = "   Ali Can    ";
        //Split metodu bir stringi istedigimiz yerden parcalamaya yarar
        //Trim methodu bir stringin bas ve sonundaki space karakterlerrini siler
        //aradaki spacelere dokunmaz
        String sTrimmed =s.trim();
        System.out.println("sTrimmed = " + sTrimmed);

        //Örnek2)Asagidaki fiyatlari verilen ürünlerin toplam fiyatini bulunuz
        // String tv ="$456.99";      String laptop = "$875.99"; ==>456.99+875.99= 1332.98
        String tv ="$456.99";
        String laptop = "$875.99";

        String tv2=tv.replace("$","");
        System.out.println("tv2 = " + tv2);

        String laptop2= laptop.replace("$", "");
        System.out.println("laptop2 = " + laptop2);

        Double totalprice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("totalprice = " + totalprice);

        //Örnek3) Verilen ismin ilk isminin ilk hafini ve soy ismninin ilk harfini ekrana yazdiriniz

        String name = "   ali cAN ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);

       char last= name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("last = " + last);




    }

}
