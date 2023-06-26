package day33exceptionsenumsiterator;

public class ExceptionRunner {

    /*
   Garbage Collector memory i temiz tutmak icin sürekli memory i tarar ve silinmesi gerekenleri siler
   Garbage Collector silmeden önce silecegi datalari finalize eder sonra siler
     */




    public static void main(String[] args) throws InvalidStudentGradeException {

      //  getStudentGrade(-50); //InvalidStudentGradeException

        getTheNumberOfStudents(50);
        getTheNumberOfStudents(-50);
    }
    public static void getTheNumberOfStudents(int numOfStudents){

        if (numOfStudents<0){
            throw new InvalidNumberException("Student number cannot be negative");
        }else {
            System.out.println(numOfStudents);
        }
    }

    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {

        if (grade < 0 || grade>100){
            throw new InvalidStudentGradeException("Student's grades cannot be less than zero or grater than 100");
        }else{
            System.out.println(grade);
        }
    }




}
