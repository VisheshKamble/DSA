class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            boolean possible = true;
            int prev = 0;

            for (int i = 0; i < n; i += k) {
                int drops = 0;
                for (int j = i; j < i + k - 1; j++) {
                    if (nums[j] > nums[j + 1]) drops++;
                }
                if (nums[i + k - 1] > nums[i]) drops++;

                if (drops > 1) { possible = false; break; }

                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                for (int j = 0; j < k; j++) {
                    min = Math.min(min, nums[i + j]);
                    max = Math.max(max, nums[i + j]);
                }

                if (min < prev) { possible = false; break; }
                prev = max;
            }

            if (possible) ans += k;
        }
        return ans;
    }
}