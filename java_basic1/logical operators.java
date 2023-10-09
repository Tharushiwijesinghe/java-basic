public class Main {
    public static void main(String[] args)
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result1 = x > y && a > b;
        System.out.println("Result is:" + result1);

        boolean result2 = x > y || a > b;
        System.out.println("Result is:" + result2);

        boolean result3 = x < y || a > b;
        System.out.println("Result is:" + result3);

        boolean result4 = x < y || a > b || a > 1;
        System.out.println("Result is:" + result4);

        
    }
}
