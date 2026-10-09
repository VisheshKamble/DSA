class Solution {
    public int minInsertions(String s) {

        int open = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
            } 
            else {

                // We need TWO ')' for every '('
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    // We already have "))"
                    i++;
                } 
                else {
                    // Only one ')' -> add one more ')'
                    ans++;
                }

                // Now this "))" needs one '('
                if (open > 0) {
                    open--;
                } 
                else {
                    // No '(' -> add one '('
                    ans++;
                }
            }
        }

        // Every remaining '(' needs two ')'
        ans += open * 2;

        return ans;
    }
}