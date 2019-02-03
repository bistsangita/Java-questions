/*Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same,
with these constraints: all the values that are multiple of 5 must be in one group, and
all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true*/

public class solution {
    public static void main(String [] args) {
        int[] arr = {2,4,2};
        int sum1=0 , sum2 = 0;
        int start = 0;
        boolean result = split53(start, arr, sum1, sum2);
        System.out.print(result);
    }
    public static boolean split53(int start , int[] arr, int sum1 , int sum2 ){
//        if(sum1 == sum2){  //stupid
//            return true;
//        }
        if(start == arr.length)
            if(sum1 == sum2 ){
                return true;
            }
            else {
                return false;
            }
        //sum1 is multiple of 5

        if(arr[start] % 5 == 0){
            return split53(start +1, arr, sum1 + arr[start], sum2);
        }
        if(arr[start] % 3 ==0 && arr[start] % 5 != 0){
            return split53(start+1 , arr, sum1, sum2+arr[start]);
        }
        return split53(start+1, arr, sum1 + arr[start], sum2) || split53(start+1 , arr, sum1 , sum2 + arr[start]);

    }

}
