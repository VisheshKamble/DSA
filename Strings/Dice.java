package Strings;

public class Dice {
    public static void main(String[] args){
        int target = 4;
        diceCombinations("" , target); 

    }

    static void diceCombinations(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1 ; i <= 6 && i <= target ; i++){
            diceCombinations(p + i , target - i);
        }
    }
}
