class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n * 2];
        
        // Fill the result array with the concatenated values
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];          // Copying first half
            result[i + n] = nums[i];      // Copying second half
        }
        
        return result;
    }
}