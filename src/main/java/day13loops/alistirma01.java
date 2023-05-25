package day13loops;

public class alistirma01 {
    public static void main(String[] args) {
        //18den 48 de kadar tüm tek sayilari yazdir

        for (int i = 18; i < 48; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        //21 den 180 e kadar hem 2 hem de 3 ile bölünebilen sayilari yazdirin

        for (int i = 21; i < 181; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");

            }


            //Size verilen bir Stringin indexi cift olan karakterlerini büyük harfe dönüstüren kod yaziniz

            String a = "arabalar";
            for (int in  = 0; i < a.length(); i++) {

                String ch = a.substring(i, i + 1);
                if (i % 2 == 0) {
                    System.out.println(ch.toUpperCase());
                }


            }


        }


    }
}
