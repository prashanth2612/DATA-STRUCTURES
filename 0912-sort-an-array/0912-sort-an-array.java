class Solution {
    public int[] sortArray(int[] nums) {
       
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    // Recursive function to divide the array into two halves
    public void divide(int[] arr, int low, int high) {
        // Base case: if the subarray has one element, it is already sorted
        if (low >= high) {
            return;
        }
        
        // Find the middle index
        int mid = low + (high - low) / 2;
        
        // Recursively divide the left and right halves
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        
        // Merge the sorted halves
        merge(arr, low, mid, high);
    }

    // Function to merge two sorted subarrays
    public void merge(int[] arr, int low, int mid, int high) {
        // Temporary arrays to hold the two halves
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];
        
        // Copy the data to the temporary arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }
        
        // Merge the two halves back into the original array
        int i = 0, j = 0, k = low;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of left[], if any
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        // Copy the remaining elements of right[], if any
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}