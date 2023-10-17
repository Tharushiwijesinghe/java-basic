import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> myDouble = new ArrayList<Double>();
        myDouble.add(10.3);
        myDouble.add(15.4);
        myDouble.add(20.2);
        myDouble.add(25.6);
        for (double i : myDouble) {
            System.out.println(i);
        }
    }
}
