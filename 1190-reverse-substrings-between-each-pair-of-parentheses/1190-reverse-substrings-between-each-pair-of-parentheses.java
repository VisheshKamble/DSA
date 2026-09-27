class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int[] stack = new int[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                top++;
                stack[top] = str.length();
            } 
            else if (ch == ')') {
                int start = stack[top];
                top--;

                int left = start;
                int right = str.length() - 1;

                while (left < right) {
                    char temp = str.charAt(left);
                    str.setCharAt(left, str.charAt(right));
                    str.setCharAt(right, temp);

                    left++;
                    right--;
                }
            } 
            else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}