package Searching;
//1295. Find Numbers with Even Number of Digits
public class EvenDigits {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);

    }
    static int findNumbers(int[] nums){
        int count = 0 ;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even (int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0 ;

    }

    static int digits (int num){

        if (num < 0){
            num *= -1 ;
        }

        if (num == 0){
            return 1 ;
        }
        
        int count = 0 ;
        while (num > 0){
            count++;
            num /= 10 ;
        }
        return count;
    }
    
}
