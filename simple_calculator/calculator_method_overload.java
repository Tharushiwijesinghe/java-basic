class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return   n1 + n2 + n3;

    }
    public int add1(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(double n1, double n2)
    {
        return n1 + n2;
    }

}
public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(7, 6, 8);
        double r2 = obj.add(8.4, 6.7);
        int r3 = obj.add1(5, 6);
        System.out.println("Sum: " +r1);
        System.out.println("Sum: " +r2);
        System.out.println("Sum: " +r3);
    }
}
