package exam;
import student.Student;

public class Result {
    int marks[] = new int[3];
    String subNames[] = new String[3];
    Student s;
    public Result(int marks[], String subNames[], Student s){
        this.marks = marks;
        this.subNames = subNames;
        this.s = s;
    }

    boolean isPass(){
        for (int i=0; i<marks.length; i++ ){
            if (marks[i]<40){
                return false;
            }
        }
        return true;
    }

    public void generateResult(){
        System.out.println(s);
        System.out.println("Sub Name \t Marks");
        for (int i=0; i<marks.length; i++ ){
            System.out.println(subNames[i] + " \t " + marks[i]);
        }
        if (isPass()){
            System.out.println("---Cangratulations You cleared this exam.---");
        }
        else{
            System.out.println("---Sorry! you havent cleared this exam.---");
        }
    }
}

