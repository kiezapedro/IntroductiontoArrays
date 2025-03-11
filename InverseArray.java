import java.util.Scanner;

public class InverseArray {

    // Method to inverse the array
    public static int[] inverseArray(int n, int[] a) {
        int[] inverse = new int[n];

        // Inverse the array by reversing its elements
        for (int i = 0; i < n; i++) {
            inverse[i] = a[n - i - 1]; // Put elements reversed
        }

        return inverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Array to store the elements
        int[] a = new int[n];

        // Read the elements of the array
        System.out.print("Enter " + n + " integers for the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Calculate the inverse of the array
        int[] result = inverseArray(n, a);

        // Display the inverse array
        System.out.print("The inverse of the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
