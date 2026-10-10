class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        long total = 0;
        for (int d : diff) {
            total += d;
        }

        if (total <= k) {
            return 0;
        }

        int[] freq = new int[max + 1];

        for (int d : diff) {
            freq[d]++;
        }

        for (int i = max; i > 0 && k > 0; i--) {
            if (freq[i] == 0) {
                continue;
            }

            long count = Math.min((long) freq[i], k);
            freq[i] -= count;
            freq[i - 1] += count;
            k -= count;
        }

        long ans = 0;

        for (int i = 1; i < freq.length; i++) {
            ans += (long) i * i * freq[i];
        }

        return ans;
    }
}