class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the two arrays into one sorted array
        int[] mergedArray = merge(nums1, nums2);
        int n = mergedArray.length;

        // Find the median
        if (n % 2 == 0) {
            // If even, average the two middle elements
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        } else {
            // If odd, return the middle element
            return mergedArray[n / 2];
        }
    }

    // Merge two sorted arrays into a single sorted array
    public int[] merge(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        // Add remaining elements from nums1
        while (i < n1) {
            mergedArray[k++] = nums1[i++];
        }

        // Add remaining elements from nums2
        while (j < n2) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }
}