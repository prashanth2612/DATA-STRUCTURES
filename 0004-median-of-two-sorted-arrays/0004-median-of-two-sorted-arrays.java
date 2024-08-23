class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        // Merge both arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        
        // If any elements are left in nums1
        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }
        
        // If any elements are left in nums2
        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }
        
        // Find the median
        int totalLength = m + n;
        if (totalLength % 2 == 1) {
            // Odd length, return the middle element
            return mergedArray[totalLength / 2];
        } else {
            // Even length, return the average of the two middle elements
            int mid1 = totalLength / 2;
            int mid2 = mid1 - 1;
            return (mergedArray[mid1] + mergedArray[mid2]) / 2.0;
        }
    }
}