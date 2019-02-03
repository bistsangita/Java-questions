/*Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index,
 such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen.
 (No loops needed.)
groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false*/


public class solution {
    public static void main(String[] args){
        int[] arr = {5,6,2};
        int target = 7;
        int start = 0;
        boolean result = groupSum6(start, arr, target);
        System.out.print(result);
    }
    public static boolean groupSum6(int start , int[] arr, int target) {

        if (target == 0) {
            return true;
        }
        if (start >= arr.length) {
            return false;
        }
        if(arr[start] == 6){
            return groupSum6(arr[start+1], arr ,target-6);
        }
        return groupSum6(start + 1, arr, target - arr[start]) || groupSum6(start + 1, arr, target);
    }
}
