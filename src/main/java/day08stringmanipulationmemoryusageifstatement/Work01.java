package day08stringmanipulationmemoryusageifstatement;

public class Work01 {
    public static void main(String[] args) {
                                                  //bahar isminin sessiz harfleri büyük sesli harfleri kücük olark konsola yazdrin

        String isim= "Bahar";

        String isim1 = isim.substring(0,1).toUpperCase()+isim.substring(1,2).toLowerCase()+isim.substring(2,3).toUpperCase()+isim.substring(3,4).toLowerCase()+isim.substring(4,5).toUpperCase();
        System.out.println("isim1 = " + isim1);

        //"Cennet annelerin ayaklari alrindadir kelimesindeki 'e a i' harflerinin önce ilk görünümü sonra son görünümlerinin toplamini konsola yazdirin

        String hadis = "Cennet annelerin ayaklari altindadir";

       int hds1 = hadis.indexOf('e');
        System.out.println("hds1 = " + hds1);

       int hds2 = hadis.indexOf('a');
        System.out.println("hds2 = " + hds2);

       int hds3 = hadis.indexOf('i');
        System.out.println("hds3 = " + hds3);

        System.out.println(hds1+hds2+hds3);

        //Son görünümler:
         int hds4 = hadis.lastIndexOf('e');
        System.out.println("hds4 = " + hds4);
         int hds5 = hadis.lastIndexOf('a');
        System.out.println("hds5 = " + hds5);
        int hds6= hadis.lastIndexOf('i');
        System.out.println("hds6 = " + hds6);

        System.out.println(hds4+hds5+hds6);

    }



}
