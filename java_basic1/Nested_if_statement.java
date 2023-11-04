import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter test score:");
        int testScore = scanner.nextInt();

        System.out.println("Enter your age: ");
        int studentAge = scanner.nextInt();

        if(testScore >= 70)
        {
            if( studentAge< 10)
            {
                System.out.println("you did a great job");
            }
            else
            {
                System.out.println("you did a pass");
            }
        }
        else
        {
            System.out.println("you did not pass");
        }
    }
}
