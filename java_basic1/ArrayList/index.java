import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(10);
        //add values
        arr.add(6);
        arr.add(87);
        arr.add(7);
        System.out.println(arr);

        //add values with index
        arr.add(0,45);
        arr.add(2,54);
        System.out.println(arr);

        //find values in the arraylist
        System.out.println(arr.contains(45));
        System.out.println(arr.contains(99));

        //change the values
        System.out.println(arr.set(0,32));
        System.out.println(arr);

        //remove the values
        System.out.println(arr.remove(2));
        System.out.println(arr);

        //print the values
        for(int i=0;i<arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }

        //print the values
        for(Integer x:arr)
        {
            System.out.println(x);
        }

        //print the values
        arr.forEach(x -> System.out.println(x));
    }

}
