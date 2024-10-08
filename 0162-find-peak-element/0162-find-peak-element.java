class Solution {
    public int findPeakElement(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check boundary conditions to avoid index out of bounds
            boolean isLeftGreater = (mid == 0) || (nums[mid] > nums[mid - 1]);
            boolean isRightGreater = (mid == nums.length - 1) || (nums[mid] > nums[mid + 1]);
            
            if (isLeftGreater && isRightGreater) {
                return mid;
            }
            
            if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
