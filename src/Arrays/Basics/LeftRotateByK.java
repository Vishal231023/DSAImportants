package Arrays.Basics;

public class LeftRotateByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;

        // Output should be: 4, 5, 1, 2, 3

        // Using temp array method
        int[] result1 = shiftArrayLeftByK(arr.clone(), k);

        // Using reverse array method
        int[] result2 = shiftArrayLeftByK1(arr.clone(), k);

        // Print results
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : result2) {
            System.out.print(num + " ");
        }
    }

    // Method 1: Using Temporary Array
    private static int[] shiftArrayLeftByK(int[] arr, int k) {
        int n = arr.length;

        // Handle edge cases
        //if (n == 0 || k % n == 0) return arr;

        k = k % n; // Reduce k if greater than array length
        int[] temp = new int[k];

        // Copy first k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy temp elements back to the array
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        return arr;
    }

    // Method 2: Using Reversal Technique
    private static int[] shiftArrayLeftByK1(int[] arr, int k) {
        int n = arr.length;

        // Handle edge cases
        if (n == 0 || k % n == 0) return arr;

        k = k % n; // Reduce k if greater than array length

        // Reverse the first part
        reverseArray(arr, 0, k - 1);

        // Reverse the second part
        reverseArray(arr, k, n - 1);

        // Reverse the whole array
        reverseArray(arr, 0, n - 1);

        return arr;
    }

    // Helper Method: Reverse a portion of the array
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}