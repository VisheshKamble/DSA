class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;

        if (target < 0) {
            return -1;
        }

        if (target == 0) {
            return n;
        }

        int start = 0;
        int sum = 0;
        int maxLength = -1;

        for (int end = 0; end < n; end++) {
            sum += nums[end];

            while (sum > target && start <= end) {
                sum -= nums[start];
                start++;
            }

            if (sum == target) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        if (maxLength == -1) {
            return -1;
        }

        return n - maxLength;
    }
}