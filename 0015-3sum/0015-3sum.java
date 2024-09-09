class Solution {

public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> res = new HashSet<>();
    if (nums.length == 0) return new ArrayList<>(res); // Convert Set to List
    Arrays.sort(nums); // Sort the array
    
    for (int i = 0; i < nums.length - 2; i++) {
        int j = i + 1;  // Second pointer
        int k = nums.length - 1;  // Third pointer
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                // Add the triplet to the Set
                res.add(Arrays.asList(nums[i], nums[j++], nums[k--])); // Convert array elements to List
            } else if (sum > 0) {
                k--; // Decrease right pointer
            } else {
                j++; // Increase left pointer
            }
        }
    }
    return new ArrayList<>(res); // Convert Set to List
}
}