class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> positions = new ArrayList<>();
        binarySearch(nums, 0, nums.length - 1, target, positions);

        if (positions.isEmpty()) {
            return new int[] {-1, -1};  // Target not found
        }

        // Sort the positions to ensure correct order of first and last occurrence
        Collections.sort(positions);
        
        // Get the first and last occurrence from the list
        int first = positions.get(0);
        int last = positions.get(positions.size() - 1);
        return new int[] {first, last};
    }
    
    public void binarySearch(int[] arr, int start, int end, int target, List<Integer> positions) {
        if (start > end) {
            return;  // Base case for recursion
        }
        
        int mid = start + (end - start) / 2;
        
        if (arr[mid] == target) {
            // Add the found position to the list
            positions.add(mid);
            
            // Search in both halves to find all occurrences
            binarySearch(arr, start, mid - 1, target, positions);  // Left side
            binarySearch(arr, mid + 1, end, target, positions);    // Right side
        } else if (arr[mid] > target) {
            binarySearch(arr, start, mid - 1, target, positions);  // Search in the left half
        } else {
            binarySearch(arr, mid + 1, end, target, positions);    // Search in the right half
        }
    }
}