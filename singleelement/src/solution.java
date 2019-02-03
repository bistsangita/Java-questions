/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.*/

public class solution {
    public static void main(String[] args){
        int[] nums= {2,1,3,1,3};
        int result = single(nums);
        System.out.print(result);

    }
    public static int single(int[] nums){
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
