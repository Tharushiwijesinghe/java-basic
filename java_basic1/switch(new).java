public class Main {
    public static void main(String[] args)
    {
        String day = "friday";
        String result = "";

        result = switch(day)
        {
            case "Saturday","Sunday" : yield "6am";
            case "Monday": yield "8am";
            default : yield "7am";
        };
        System.out.println(result);
    }
}
