package day02datatypesmethodcreation;

public class Variables02 {
   /*
   Java da temelde 2 tip data vardir.
   1)Primitive data type (8 tanedir)
   char,boolean,byte,short,int,long,float,double,
   2)non-primitive data type
    */
    /*
    Note1: Primitive data typelerini java olusturmustur biz olusturamayiz
    Note2: Primitive data typelerinde isimlerinde sadece kücük harf kullanilir
    Note3: primite datalar data typelerine göre memory de farkli farkli yer kaplar *önemli bilgi*
    Note4: Primite datalar iclerinde sadece sizin atadiginiz degeri barindirirlar
     */

    /*
    Non-Primitive Data types
    Ornegin String, non-primitive bir data typedir
    *Üretilen her bir class ayni zamanda bir "non-primitive" data type dir. bu yüzden non-primitive"
    data typeler sinirsiz sayidadir denilebilir
    *Non-primitive data typelerin isimleri büyük harf ile baslar
    *Non primitive'ler icin Java, Memory de büyüklügüne göre degisen boyutlarda yer ayirir
  */public static void main(String[] args) {
        //Ornek 1: Ülke ismi icin bir Variable olusturup bir deger yükleyin ve konsola yazdirin
        String ülkeIsmi ="Türkiye";
        System.out.println(ülkeIsmi);
/*
 Soru: Primitive ve non-Primitive data type leri arasindaki farklar nelerdir?
 1) Primitive ler sadece bizim atadigimiz degeri icerir,
 Non-Primitive'ler ise bizim atadigimiz degeri ve methotlari icerir
 2) "primitiveler kücük harf ile baslar
 "Non Primitive" ler ise büyük harf ile baslar
 3)Primitiveleri Java üretmistir ve 8 tanedir,
 Non-Primitive leri ise Java ve developerler üretebilir,sinirsiz sayidadir
 4)Primitive ler memorry de data type lerine göre sasbit boyutta bellek kullanir
 Non-Primitive ler icin Java memory de büyüklügüne göre degisen boyutlarda bellek kullanabilir
  */
  }


    }

