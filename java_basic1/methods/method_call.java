public class Test {
    void call(String name)
    {
        System.out.println("take a call from " + name);
    }

    public static void main(String[] args)
    {
        Test phone1 = new Test();
        phone1.call("nokia");
    }
}
