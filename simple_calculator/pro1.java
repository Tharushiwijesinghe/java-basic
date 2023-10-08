import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);
        int num1, num2, answer;

        System.out.println("Enter first number:");
        num1 = sun.nextInt();

        System.out.println("Enter second number:");
        num2 = sun.nextInt();

        answer = num1 + num2;
        System.out.print("Answer is " + answer);

        // Close the scanner to avoid resource leaks
        sun.close();
    }
}
