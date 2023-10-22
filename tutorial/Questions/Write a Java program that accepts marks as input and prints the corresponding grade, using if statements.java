import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int marks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks = scanner.nextInt();
        char grade = 0;
        if(marks>=80 && marks<=100)
        {
            grade = 'A';
        }
        if(marks>=70 && marks<80)
        {
            grade = 'B';
        }
        if(marks>=60 && marks<70)
        {
            grade = 'C';
        }
        if(marks>=50 && marks<60)
        {
            grade = 'D';
        }
        if(marks>=40 && marks<50)
        {
            grade = 'E';
        }
        if(marks>=00 && marks<40)
        {
            grade = 'F';
        }
        System.out.println("Grade: "+  grade);
    }
}
