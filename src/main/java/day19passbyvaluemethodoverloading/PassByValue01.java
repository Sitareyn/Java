package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //Note : Java passbyvalue sayesinde variablelerin original degerlerini korur

        int shirtPrice=100;

        //Java methodu gönderirken original degeri degil,kopysini gönderir ve degisen deger kopya deger olur
        System.out.println(discount("student" , shirtPrice));
        System.out.println(discount("veteran" , shirtPrice));
        System.out.println(discount("senior" , shirtPrice));

        System.out.println("shirtPrice = " + shirtPrice);


    }
    //Discount methodu olusturalim

    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;

            case "veteran":
                price = price - 20;
                break;

            case "senior":
                price = price - 5;
                break;
            default:price=price;
        }
    return price;
    }
 /*
    Pass By Value:
    1) Java "pass by value" kullanir
    2) Yani java method larin original degeri degistirmesine musade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur veo o kopyayi method a yollar.
        Method kopya deger uzerinde degisiklik yapar, boylece original deger korunmus olur.
    4)Java esnek bir dildir, istersek yazdigimiz kod ile original degerini degistirebiliriz
    bkz: Line 16

     1)PassByReferance'da methoda referans yollanir.
     2)Referance asres demektir.Adres yollaninca method adresi kullanarak original degere ulasir ve original degeri degistirir
     Bu yüzden 'C#' gibi Pass By Referance kullanan dillerde method variable in original degerini degistirir

     */


}
