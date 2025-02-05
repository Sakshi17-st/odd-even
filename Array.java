import java.util.Scanner;

public class Array {

    // Method to convert array to string representation
    public static String toString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]"); 
        return sb.toString();
    }

    // Method to sort the array using Bubble Sort (ascending order)
    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Custom binary search method
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return mid; // Return index if key is found
            }
            if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Return -1 if key is not found
    }

    // Method to reverse the array
    public static void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap elements at positions i and n-i-1
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    // Method to find the sum of array elements
    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    // Method to find the maximum element in the array
    public static int max(int[] array) {
        int maxValue = array[0];
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Method to find the minimum element in the array
    public static int min(int[] array) {
        int minValue = array[0];
        for (int num : array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    // Method to calculate the average of the array elements
    public static double average(int[] array) {
        int total = sum(array); // Use sum method to calculate total
        return total / (double) array.length;
    }

    // Method to copy the array into a new array
    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Method to swap two elements in the array
    public static void swap(int[] array, int i, int j) {
        if (i >= 0 && j >= 0 && i < array.length && j < array.length) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Main method to demonstrate the methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Read the number of elements for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Input: Read the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Display array using toString method
        System.out.println("Array: " + toString(array));

        // Sum of array elements
        System.out.println("Sum of array elements: " + sum(array));

        // Maximum element in the array
        System.out.println("Maximum element in the array: " + max(array));

        // Minimum element in the array
        System.out.println("Minimum element in the array: " + min(array));

        // Average of array elements
        System.out.println("Average of array elements: " + average(array));

        // Sort the array
        sort(array);
        System.out.println("Sorted array: " + toString(array));

        // Reverse the array
        reverse(array);
        System.out.println("Reversed array: " + toString(array));

        // Binary search for an element
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        int index = binarySearch(array, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }

        // Copy the array
        int[] copiedArray = copy(array);
        System.out.println("Copied array: " + toString(copiedArray));

        // Swap elements in the array
        System.out.print("Enter two indices to swap: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        swap(array, i, j);
        System.out.println("Array after swapping indices " + i + " and " + j + ": " + toString(array));

        sc.close();
    }
}