package day12nestedternaryswithcloops;

public class Switch01 {
    public static void main(String[] args) {
        //Java da kodlarimizi yazarken Nested yapilardan mümkün oldugunca uzak durmaliyiz
        //cünkü bu tarz yapilar uygulamayi yavaslatir.(Time Consuming)
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
   // Sunday==>1  . . .  Saturday==>7

        //1.yol if else cözümü
        String dayName= "Tuesday";

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        }else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        }else{
            System.out.println("Lütfen gecerli bir gün giriniz");
        }
   //2,Yol Switch(degistir demek)

        switch (dayName.toUpperCase()){
            case"sunday":
                System.out.println(1);
                break;
            case"monday" :
                System.out.println(2);
                break;
            case"tuesday":
                System.out.println(3);
                break;
            case"wednesday":
                System.out.println(4);
                break;
            case"thursday":
                System.out.println(5);
                break;
            case"friday":
                System.out.println(6);
                break;
            case"saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lütfen gecerli bir gün ismi giriniz");



        }







    }

    }

