package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception {

    public InvalidStudentGradeException(String message){
        super(message);
    }

    /*
    1) Custom Exception Class olussturmak icin Exception Class a exdends etmeliyiz
       Exception Class a extends ederek olusturdugumuz custom exception "Compile Time Exception" olur
       Eger RunTime Exception üretmek istersek o zaman RuntimeException Class a extends etmeliyiz.

    2) Custom  Exception Class olustururken constructor olusturmaliyiz ve bu Constructor parentteki
       Constructor u cagirmalidir
       Bu Constructor mesaj verecek veya vermeyecek sekilde olusturulabilir.

    3) Custom Exception Class olusturdugunuzda ismin sonunda Exception kelimesini kulanmalisiniz

     */

}
