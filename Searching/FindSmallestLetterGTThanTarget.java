package Searching;

//leetcode 744. Find Smallest Letter Greater Than Target

public class FindSmallestLetterGTThanTarget {
    public static void main(String[] args){
        
        char[] letters = {'c', 'f', 'j'} ;
        char target = 'a' ;
        char ans = nextGreatestLetter(letters , target) ;
        System.out.println(ans);

    }

     static char nextGreatestLetter(char[] letters, char target) {  
        int start = 0 ; 
        int end = letters.length - 1 ;
        while (start  <= end){
            int mid = start + ( end - start) / 2 ;
            if (letters[mid] <= target){
                start = mid + 1
;            }else{
                end = mid - 1 ;
            }
        }

        //we used % because if the target is greater than or equal to the last letter, it will return the first letter in the array eg. letters = ['c', 'f', 'j'], target = 'j' => output = 'c'
        return letters[start % letters.length] ; // if the target is greater than or equal to the last letter, it will return the first letter in the array
     }
}
