package student;
public class Student {
    int id;
    String name;
    int semester;

    public Student(int id, int semester, String name){
        this.id = id;
        this.name = name;
        this.semester = semester;
    }

    public String toString(){
        return "Id " + id + " \nName : " + this.name + "\tsemester : " + this.semester;
    }
}
