class Solution {
    public int minLengthAfterRemovals(String s) {
        int countofA = 0 ;
        int countofB = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a'){
                countofA += 1;
            }else{
                countofB += 1;
            }
        }

        return Math.max(countofA , countofB) - Math.min(countofA , countofB);
        
    }
}