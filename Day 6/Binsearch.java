import java.util.Scanner;

class Binsearch {

    // Method for performing binary search
    int binarySearch(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the key is present at mid
            if (arr[mid] == key)
                return mid;

            // If key is greater, ignore the lower half
            if (arr[mid] < key)
                low = mid + 1;

            // If key is smaller, ignore the upper half
            else
                high = mid - 1;
        }
        // If the element is not present, return -1
        return -1;
    }

    public static void main(String args[]) {
        Binsearch obj = new Binsearch();
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the key to be searched
        System.out.print("Enter the key to be searched: ");
        int key = sc.nextInt();

        // Perform binary search
        int result = obj.binarySearch(arr, 0, n - 1, key);

        // Output the result
        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
        
        sc.close();
    }
}
