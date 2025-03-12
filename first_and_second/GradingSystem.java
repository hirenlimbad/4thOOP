import java.util.Scanner;

class GradingSystem {

    public static char getGrade(int marks[], int max){
        float summation = 0;
        max = max * 5;
        for (int i = 0; i < marks.length; i++) {
            summation += marks[i];
        }

        float avg = summation / max * 100;
        if (avg>=95){
            return 'A';
        }
        else if (avg>=85){
            return 'B';
        }
        else if (avg>=70){
            return 'C';
        }
        else if (avg>=55){
            return 'D';
        }
        return 'F';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.print("Marks will be out of? : ");
        int max = sc.nextInt();

        System.out.print("Enter your 5 subject marks followed by space: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        char grade = getGrade(marks, max);
        System.out.println("Your grade is: "+ grade);
    }   
}
