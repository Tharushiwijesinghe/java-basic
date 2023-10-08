public class Main {
    public static void main(String[] args)
    {
        int num1 = 7;
        int num2 = 5;

        //Addition
        int result1 = num1 + num2;
        System.out.println(result1);

        //Subtraction
        int result2 = num1 - num2;
        System.out.println(result2);

        //Modulus
        int result3 = num1 % num2;
        System.out.println(result3);

        //Multiplication
        int result4 = num1 * num2;
        System.out.println(result4);

        //division
        int result5 = num1 / num2;
        System.out.println(result5);

        //add 2 for num1
        num1 = num1 + 2;
        System.out.println(num1);

        num1 += 2;
        System.out.println(num1);

        num1 ++; //post-increment
        System.out.println(num1);


        num1 --; //post-decrement
        System.out.println(num1);

        ++num1 ; //pre-decrement
        System.out.println(num1);

        --num1 ; //pre-decrement
        System.out.println(num1);

    }
}
