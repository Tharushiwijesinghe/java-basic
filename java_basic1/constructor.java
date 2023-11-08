public class Test {
    String name;
    Test()
    {
        name = "kamal";
        System.out.println("welcome");
    }

    void meth(){
        System.out.println("hello");
    }

    public static void main(String[] args)
    {
        Test obj = new Test();
        System.out.println(obj.name);
    }
}
