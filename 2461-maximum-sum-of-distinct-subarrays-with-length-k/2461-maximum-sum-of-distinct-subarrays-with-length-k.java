import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0, maxSum = 0;

        // To store distinct elements in current window
      HashSet<Integer> set = new HashSet<>();

        int left = 0;

        for (int right = 0; right < n; right++) {

            // If duplicate found, shrink window from left
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            sum += nums[right];

            // When window size becomes k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                // Slide window forward
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
