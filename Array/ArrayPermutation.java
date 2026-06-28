//1920. Build Array from Permutation

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] result = buildArray(nums);

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0 ; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
