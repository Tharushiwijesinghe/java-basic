import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        System.out.println("Enter your first name: ");
        firstName = scanner.next();

        String secondName;
        System.out.println("Enter your second name: ");
        secondName = scanner.next();

        String thirdName;
        System.out.println("Enter your third name: ");
        thirdName = scanner.next();

        System.out.println(thirdName+","+" "+firstName+" "+secondName.charAt(0)+".");
    }
}
