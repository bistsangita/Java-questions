/*Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to
 the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value,
 they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2},
  either all three 2's in the middle must be chosen or not, all as a group.
  (one loop can be used to find the extent of the identical values).

groupSumClump(0, [2, 4, 8], 10) → true
groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
groupSumClump(0, [2, 4, 4, 8], 14) → false
is */


public class solution {
    public static void main(String[] args){
        int[] arr = {2,4,4,8};
        int start = 0;
        int target = 14;
        boolean result = groupSumClump(start, arr, target);
        System.out.print(result);

    }
    public static boolean groupSumClump(int start, int[] arr, int target){
        if(target == 0){
            return true;
        }
        if(start > arr.length){
            return false;
        }
       //int counter=0;
        int sumOfSAmeValue = 0;
        //if(arr[start] == arr[start+1]) {
            for (int i = start; i < arr.length; i++) {
                if(arr[start] == arr[start+1])
                sumOfSAmeValue = sumOfSAmeValue + arr[i];


//            while(arr[start] != arr[start+1]){
//                sumOfSAmeValue = sumOfSAmeValue +arr[start];
//                counter++;
//
//            }
            return groupSumClump(arr[start+1], arr, target- sumOfSAmeValue);
        }

           // return groupSumClump(arr[start+1], arr ,target-sumOfSAmeValue);

        return groupSumClump(start + 1, arr, target - arr[start]) || groupSumClump(start + 1, arr, target);

    }
}
