
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        boolean firstSmallest = true;
        boolean lastLargest = true;
        boolean firstUniqueLargest = true;
        boolean lastUniqueSmallest = true;

        for (int i = 1; i < n; i++) {
            if (first > s.charAt(i)) {
                firstSmallest = false;
            }
            if (first <= s.charAt(i)) {
                firstUniqueLargest = false;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (last < s.charAt(i)) {
                lastLargest = false;
            }
            if (last >= s.charAt(i)) {
                lastUniqueSmallest = false;
            }
        }

        if (firstSmallest || lastLargest) return 1;

        if (firstUniqueLargest && lastUniqueSmallest) {
            return 3;
        }

        return 2;
    }
}
