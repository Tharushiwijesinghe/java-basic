public class Bank {
    int rupees;
    Bank()

    {
       rupees=0;
    }
    Bank(int x)
    {
       rupees=x;
    }

    public static void main(String[] args)
    {
        Bank nimal = new Bank();
        Bank kamal = new Bank(20);
        System.out.println(nimal.rupees);
        System.out.println( kamal.rupees);
}
}
