/*
Return a version of the given array where each zero value in the array is replaced by the
 largest odd value to the right of the zero in the array. If there is no odd value to the right
  of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]*/



public class solution {
    public static void main(String[] args) {
        int[] arr = {0, 4, 0, 3};
        zeroMax(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static int[] zeroMax(int[] arr) {
//       int largestOdd = 1 ;
//        for(int i=0; i<arr.length-2; i++){
//
//            if(arr[i] == 0){
//                int k =i+1;
//                //checking big odd on ahead
//                if(arr[k] % 2 != 0 ){   //should check if there is no more bigger one left
//
//                    if(arr[k]<arr[k+1]){
//                        largestOdd = arr[k+1];
//                        arr[i] = largestOdd;
//                    }
//                }
//                return arr;
//            }
//
//        }
//        return largestOdd;
//    }
        int max = 0;
//
//        for(int i=0; i< arr.length-1; i++){
//            if(arr[i] == 0){
//                for(int j= i +1; j < arr.length-1;  j++ ){
//                    if(arr[j] > max && arr[j] %2 != 0){  //  if num is largest  and odd
//                        max = arr[j];
//                    }
//                    arr[i] = max;
//
//                }
//            }
//
//        }
//        return arr;
//
//    }
        //I tried to do it from front , its correct when i access array backwards


        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i]!=0 && arr[i]%2==1 ){   //make sure num is not 0 and odd
                if(max<arr[i]) {
                    max = arr[i];     //if its greater than max , its new max now
                }
            }
            if(arr[i]==0){
                arr[i]=max;
            }
        }
        return arr;
    }
}
