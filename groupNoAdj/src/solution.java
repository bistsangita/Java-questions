/*Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given
 target with this additional constraint: If a value in the array is chosen to be in the group,
 the value immediately following it in the array must not be chosen. (No loops needed.)


groupNoAdj(0, [2, 5, 10, 4], 12) → true
groupNoAdj(0, [2, 5, 10, 4], 14) → false
groupNoAdj(0, [2, 5, 10, 4], 7) → false
*/

public class solution {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 4};
        int target = 7;
        int start = 0;
        boolean result = groupNoAdj(start, arr, target);
        System.out.print(result);
    }
    public static  boolean groupNoAdj(int start, int[] arr, int target ){
        if(target == 0){
            return true;
        }
        if(start >= arr.length){
            return false;
        }


        //when you select the number , skip next one , so its start +2
        //when you don't select the number , just move forward , no need to - from the target
        return groupNoAdj(start +2 , arr, target-arr[start]) || groupNoAdj(start+1, arr, target);
    }

}
