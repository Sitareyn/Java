package day20statickeywordconstructors;

public class stdRunner {
    public static void main(String[] args) {
        //stdName static oldugundan ina ulasmak icin object olusturmadan sadece
        //class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);

       //
        Student std1=new Student();
        System.out.println(std1.age);


Student.staticMethod();
std1.nonStaticMethod();

    }
}
