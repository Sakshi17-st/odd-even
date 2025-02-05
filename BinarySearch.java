public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72}; // Sorted array
        int n = arr.length;
        int key = 23; // Key to search
        
        int low = 0, high = n - 1, mid;
        boolean found = false;
        
        while (low <= high) {
            mid = (low + high) / 2;
            
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Element not found.");
        }
    }
}