package day27abstraction;

public abstract class Courses {
    //Abstraction
public abstract void math();

public void art(){
    System.out.println("Learn art");
}


/*    1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece
    child classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak
    "Abstraction" yapariz.
    2)Bazen parent class daki methodun bodysi hicbir child class tarafindan kullanilmaz.
    Bu durumda parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir
    Bizde yazmayiz
    3)Body si yazilmayan method Abstract Mehod denir. Abstract ingilizcede vucutsut yada soyut demektir
    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak
    javaya bu methodun bodyis olmayacak deriz
    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz
    o yuzden classi da abtstract yapmaliyiz
    6) Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum childler icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
    7)Body si olan methodlar (=Concrete Method) abstract classlarin icine yazilabilir.
    ama abstract methodlar concrete class larin icine yazilamazlar,hata verirler. Concrete methodlar child class lar tarafindan override edilmek zorunda
    8)Abstract keyword ile method body mrthodda ayni anda kullanilamaz
    9)final methodlar abstract olmazlar.final methodlar override edilemezler ,halbuki abstract methodlar
    override edilmek icin olusturulurlar .Bu celiskidir , bu yüzden java abstract methodlarin final
    olmasina iizin vermez
    10)"abstract class"larin icinde abstract methodlar olur."abstract methodlar" body si olmadigindan eksik methodlar gibi
    düsünülebilir,yani abstract class icinde eksik bir yapi barindirir.Eger siz abstract class dan object
    üretirseniz bu eksiklik object e yansir .java bunu istemez cünkü eksik object eksik isyapar
    buda applicationin yanlis calismasina sebep olur
    java application u korumak icin abstract classlardan object uretilmesini engellemistir
    11) "abstract class"larin constructor i vardir ama object olusturamazlar
    12)Abstract class in abstract child i veya concrete childi olabiliyor.Eger child abstrac ise absstact methodlari override etmek
    zorunda degildir
    13)"abstract methodlar " private olamazlar cünkü child classlar abstract method u kullanir,private yapinca kullanima kapali olur
    .Bu celiskidir , bu yüzden java abstract methodun private olmasina izin vermez
    14)Class lar final oldugunda child class a sahip olamazlar . Ama abstract class lar icin child class olmalidir.
    cünkü child classlar abstract parent class daki abstract methodlari kullanirlar.
    bu yüzden java abstract classlarin final olmasina müsaade etmez
     */


}
