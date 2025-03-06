import java.util.Scanner;

public class SpanofArray {
    // Main method - entry point of the program
    public static void main(String[] args) throws Exception {

        // Create a scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        // prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        // create an integer array to store the input elements
        int[] arr = new int[n];

        // prompt the user to enter the elements of the array
        System.out.println("Enter the " + n + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); // store each input value in the array
        }
        // initialize min and max with the first elements of the array
        int min = arr[0];
        int max = arr[0];

        // loop through the array to find the minimum and maximum values
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i]; // update min if a smaller element is found
            }
            if (arr[i] > max) {
                max = arr[i]; // update max if a larger element is found
            }
        }
        // Calculate the span of the array (max - min)
        int span = max - min;

        // Print the span of the array
        System.out.println("The span of the array is: " + span);
    }
}