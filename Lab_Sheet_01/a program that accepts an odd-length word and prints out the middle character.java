import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your input: ");
        String str = scanner.next();
        int mid = str.length()/2;
        if(str.length()%2==1)
        {
            System.out.println("print the middle character: "+ str.charAt(mid));
        }
        else {
            System.out.println("This is not valid");
        }
    }
}
