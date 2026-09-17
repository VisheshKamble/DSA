class Solution {
    public int findKthPositive(int[] arr, int k) {
        int curr = 1 ;
        int start = 0 ;

        while(k != 0){
            if(start < arr.length  ){
                if(curr == arr[start]){
                    curr++;
                    start++;
                    continue ;
                }
            }
            k--;
            curr++;
        }

        return curr - 1 ;
        
    }
}