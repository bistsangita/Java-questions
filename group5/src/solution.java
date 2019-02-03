/*Given an array of ints, is it possible to choose a group of some of the ints, such that the
 group sums to the given target with these additional constraints: all multiples of 5 in the array must be
  included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)


groupSum5(0, [2, 5, 10, 4], 19) → true
groupSum5(0, [2, 5, 10, 4], 17) → true
groupSum5(0, [2, 5, 10, 4], 12) → false*/



public class solution {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 4};
        int start = 0;
        int target = 19;
        boolean result = groupSum(start, arr, target);
        System.out.print(result);
    }
    public static boolean groupSum(int start , int[] arr, int target) {


        if (target == 0) {
            return true;
        }

        //
        if (start >= arr.length) {
            return false;
        }
        //chk for question conditions
        if (arr[start] % 5 == 0) {
            if(arr[start+1] == 1 ){
                return groupSum(start+2, arr , target-arr[start]);
            }
            return groupSum(start+1, arr, target-arr[start]);
        }

        return groupSum(start + 1, arr, target - arr[start]) || groupSum(start + 1, arr, target);

        //return groupSum(start + 1, arr, target);
    }

}
