package day33exceptionsenumsiterator;

public class EnumsRunner {

    public static void main(String[] args) {

   Cities ankara =  Cities.ANKARA;
        System.out.println(ankara);

  String adanaCityName= Cities.ADANA.getCityName();
        System.out.println(adanaCityName);

        System.out.println("Cities.ANKARA.getPlateCode() = " + Cities.ANKARA.getPlateCode());

    }

}
