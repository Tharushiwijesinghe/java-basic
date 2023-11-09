public class Main {
    //method overloading
    public void meth()
    {
        System.out.println("method 1");
    }
    public void meth(int x)
    {
        System.out.println("method 2");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.meth(7);
        main.meth();

    }
}
