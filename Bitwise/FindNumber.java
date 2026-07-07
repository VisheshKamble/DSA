package Bitwise;

public class FindNumber {

    public static void main(String[] args) {

        int[] arr = {2,2,3,2,7,7,8,7,8,8};

        System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr){

        int ans = 0;

        for(int bit = 0; bit < 32; bit++){

            int count = 0;

            for(int num : arr){

                if(((num >> bit) & 1) == 1){
                    count++;
                }
            }

            if(count % 3 != 0){
                ans |= (1 << bit);
            }
        }

        return ans;
    }
}