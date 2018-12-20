/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false */
public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 1};
        int[] arr1 = {1, 1, 2, 2, 2, 1};
        int[] arr2 = {1, 1, 1, 2, 2, 2, 1};
        int[] arr3 = {1};


        boolean result = checkTriplets(arr);
        boolean result1  = checkTriplets(arr1);
        boolean result2 = checkTriplets(arr2);
        boolean result3 = checkTriplets(arr3);


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

    public static boolean checkTriplets(int[] arr) {

        if (arr.length < 2) {
            return true;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && arr[i] == arr[i - 2]) {
                return false;
            }
        }
        return true;
    }
}



