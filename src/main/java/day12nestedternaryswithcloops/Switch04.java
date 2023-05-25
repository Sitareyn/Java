package day12nestedternaryswithcloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
/*
  Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kisaltmasini istediginiz bir ülke ismi giriniz");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()) {
            case "america":
                System.out.println("US");
                break;
            case "england":
                ;
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "türkiye":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ülke tanimli degildir");
        }
        /*
        1)Öncelikle Github ta bulunan projeyi kendi lokalimize almak icin
        a)Clone lamak isteden profilin url i kopyalanir
        b)Intellij den file+new+project+ project from version control
        bundan sonra codelari Intellij üzerinden terminal acilarak git pull denilerek kendi lokalimize cekebilrirz

        2)Kendi lokalimize almis oldugumuz projeyi Git hub ta saklamak icin
        a)Github ta yeni bir repo olusturacaksiniz,bunun icin repositories e tiklayin , sag üst kösede yesil new e tiklayin
        b)Acilan sayfada  bir isimlendirme yapilarak repo public mi private mi olsun karar ve create a tiklanacak
        c)Acilan yeni bos repo sayfasindan url kopyalanacak
          d) Intellij den gondermek istedigimiz proje acik iken terminal kismi acilacak
          e) git push (=>url<=) copy + paste yapilarak enter yapacaksiniz*/




    }
}
