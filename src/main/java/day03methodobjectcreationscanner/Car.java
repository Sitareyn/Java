package day03methodobjectcreationscanner;

public class Car {

    //Variable olurturalim(pasif özellikler)
    public String model = "Tesla";
    public int fiyat = 20000;

    //Methodlari olusturalim (aktif özellikler)
    //Note: return typr void oldugunda method icinde "return" keywordu kullanilmaz
    public void hareket (){
        System.out.println("Tesla cok hizli hareket eder..");
    }
    public void dur(){
        System.out.println("Cok güvenli bir sekilde durur");
    }

    public class Teach {
        //variable olusturuyoruz (pasif özellikler)
      public String ismi ="Teacher" ;
      public int yas = 32;
      public String brans = "Matematik";

        //methodunu yazacagiz yani aktif özelliklerini

        public void ozellik (){
            System.out.println("ögrencileriyle cok iyi anlasisr");
        }
        public void ozellik2 (){
            System.out.println("Okulun en iyi matematik ögretmenidir");
        }
         public void ilgiAlani (){
             System.out.println("müzige ilgisi vardir gitar calar");
         }



        }


    }



