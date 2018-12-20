/*Given an array of scores, return true if each score is equal or greater than the one before.
 The array will be length 2 or more.


scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true*/


public class solution {
    public static void main(String[] args){
        int[] arr = {1, 3, 4};
        boolean score = scoreIncreasing(arr);
        //System.out.print(score);

        int[] arr1 = {1,3,2};
        boolean score1 = scoreIncreasing(arr1);
        System.out.print(score1);
    }
    public static boolean scoreIncreasing(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] < arr[i]){
                return false;
            }
        }
        return true;
    }
}
