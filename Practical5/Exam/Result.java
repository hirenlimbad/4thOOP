
public class Result implements Exam, Classify {

    public boolean pass(int mark){
        if (mark >= 50){
            return true;
        }
        return false;
    }

    public String division (int average){
        if (average >= 60){
            return "First";
        }
        if (average >= 50){
            return "Second";
        }
        return "no division.";
    }
}
