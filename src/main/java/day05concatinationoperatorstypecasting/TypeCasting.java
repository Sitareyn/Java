package day05concatinationoperatorstypecasting;

public class TypeCasting {

        /*
        Numerik primitive data type larinin birbirirnin dönüstürülmesine (Type Casting) denir
        Numeric (sayisal) Data type ler: byte - short - int - long - float - double
        */
//NOTE1) Kücük data typelerini büyük data typelerina cevirmeyi java otomatik olarak yapar
    //bu isleme "AutoWidening" (Otomatik genisletme) denir.
//NOTE2) Büyük data type lerini kücük data typelerina cevirmek riskli bir istir
    //Java bu riskli isi otomatik olarak yapmaz.
    //Bu isleme "ExplicitNorrowing" (Aciktan Daraltma) denir
        public static void main(String[] args) {
            //byte data type ini int data type ina ceviriniz

            byte age = 13;
            int ageInt = age; // AutoWiedenig

            //Int fdata type ini short data type ina ceviriniz

            int weight= 312;
            short weightShort = (short) weight ; //ExplicitNorrowing

            //int data type ini flaot data type ina ceviriniz
            int population = 7000;
            System.out.println(population);//7000

            float populationFloat = population;
            System.out.println(populationFloat);//7000.0

            //double data typeini short data type ina ceviriniz
            double number = 12.99;
            System.out.println(number);//12.99

            short numberShort=(short) number;
            System.out.println(numberShort);//12

            //Example
            short num=260;
            System.out.println(num); //260

            byte numByte =(byte)num;
            System.out.println(numByte);

            //Dönüsüm yaptigimiz sayi(260) donuseceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile mod islemi yapar ve mod isleminin
            //        //sonucu sizin yeni degeriniz olur




        }

    }

