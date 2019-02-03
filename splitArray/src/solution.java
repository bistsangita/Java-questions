/*Given an array of ints, is it possible to divide the ints into two groups,
so that the sums of the two groups are the same. Every int must be in one group or the other.
Write a recursive helper method that takes whatever arguments you like, and make the initial
 call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true*/

public class solution {
    public static void main(String[] args){
        int[] arr = {2,2};
        int start = 0;
        int group1 = 0;
        int group2 =0;
        boolean result = splitArray(start, arr, group1, group2);
        System.out.print(result);



    }
    public static boolean splitArray(int start , int[] arr, int group1 , int group2) {
        return splitArrayHelper(start, arr, group1, group2);
    }

    public static boolean splitArrayHelper(int start, int[] arr, int group1,int group2) {
        if(start >= arr.length) {
            if (group1 == group2) {
                return true;
            } else {
                return false;
            }
        }
        return splitArrayHelper(start+1, arr, group1 + arr[start], group2) || splitArrayHelper(start+1, arr, group1, group2 + arr[start]);

    }
}
