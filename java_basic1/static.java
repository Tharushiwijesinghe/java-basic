public class Test {
    String name;

    void call(){
        System.out.println("take a call from "+name);
    }
    public static void main(String[] args)
    {
        //if you have 10 phones you should create 10 objects
        Test phone1 = new Test();
        Test phone2 = new Test();
        Test phone3 = new Test();
        phone1.name = "Apple";
        phone2.name = "Samsung";
        phone3.name = "huwawei";
        phone3.call();
        phone1.call();
        phone2.call();

    }
}
