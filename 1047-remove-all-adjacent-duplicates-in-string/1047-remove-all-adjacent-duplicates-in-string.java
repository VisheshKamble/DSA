class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek() == c){
                    stack.pop();
                }
                else{
                stack.push(c);
            }
          }else{
            stack.push(c);
          }
        }

        String result = "" ;
        for(char ch : stack){
            result += ch;
        }

        return result;
        
    }
}