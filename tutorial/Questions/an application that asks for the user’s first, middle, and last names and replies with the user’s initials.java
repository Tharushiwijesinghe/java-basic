import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname;
        System.out.println("Enter your first name: ");
        firstname = scanner.next();

        String middlename;
        System.out.println("Enter your middle name: ");
        middlename = scanner.next();

        String lastname;
        System.out.println("Enter your last name: ");
       lastname = scanner.next();

        System.out.println("full name user's initials: "+ firstname.substring(0,1)+ ". " + middlename.substring(0,1)+". " + lastname.substring(0,1)+".");



    }
}
