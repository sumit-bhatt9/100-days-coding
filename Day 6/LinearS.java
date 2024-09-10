import java.util.Scanner;

public class LinearS {

    // Method to perform linear search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;  // Return the index if the element is found
            }
        }
        return -1;  // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Get the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the key to search
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(array, key);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}
