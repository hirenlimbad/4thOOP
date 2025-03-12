// Define a class Time with hours and minutes as two data members, add necessary
// member functions to initialize and display data of class. Do not use constructors in a
// class. Define a member function sum () which adds two Time objects. (Use the
// statements like T3.sum (T1, T2)).


public class TimeCalc {
    int hours = 0;
    int minites = 0;

    void setTime(int hours, int minites){
        this.hours += hours;
        this.minites += minites;
    }

    public String toString(){
        return "Time is : " + this.hours + ":" + this.minites ;
    }

    public void sum(TimeCalc t1, TimeCalc t2){
        int minites = t1.minites + t2.minites;
        int hours = t1.hours + t2.hours;
        if (minites >= 60){
            this.hours++;
            minites = minites - 60;
        }
        this.setTime(hours, minites);
    }
}