/*We'll say that an element in an array is "alone" if there are values before and after it,
 and those values are different from it. Return a version of the given array where every instance of the given value
  which is alone is replaced by whichever value to its left or right is larger.
notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]*/

public class solution {
    public static void main(String[] args){
    int[] arr = {1, 2, 3, 2, 5, 2};
    int val = 2;
    int[] result = notAlone(arr,val);
    for(int i: result){
        System.out.print(i);
    }
}
    public static int[] notAlone(int[] arr , int val){
        if(arr.length == 0){
            return arr;
        }
        //starting from 1 instead of 0 because in )th element would not have any value before it
        for(int i=1; i<arr.length-1; i++){
            //chk if array element is the value, and chk if is not same as previous and after element
            if(arr[i] == val && arr[i] != arr[i-1]  && arr[i] != arr[i+1]){
                //now change the value of arr element , which ever is greater previous or after

                // not writing max function ,just using lib one
                //which ever is greater ,put value of it into current element
                arr[i] = Math.max(arr[i-1], arr[i+1]);
            }

        }
        return arr;
    }
}

