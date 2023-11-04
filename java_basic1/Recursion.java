public class Recursion {
    public static int factorial(int n){
        //base case
        if(n==1){
        return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int facto = factorial(5);
        System.out.println("factorial:" + facto);
    }
}
