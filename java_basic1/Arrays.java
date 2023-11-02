public class ShortArrayExample {
    public static void main(String[] args) {
// Declare and initialize a short array
        short[] temperatures = { 22, 24, 23, 21, 20 };
// Access and print values from the array
        System.out.println("Temperature at 2nd hour: " + temperatures[1]);
// Calculate and print the length of the array
        int length = temperatures.length;
        System.out.println("Number of temperature readings: " + length);
// Update an element in the array
        temperatures[0] = 25;
        System.out.println("Updated temperature at 1st hour:" + temperatures[0]);
    }
}
