import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = scanner.nextDouble();

        int feet = (int)(length/30.48);
        int inches = (int) ((length%30.48)/2.54);

        System.out.println(feet +" feet "+"and "+inches+" inches");

    }
}
