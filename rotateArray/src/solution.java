public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
    }
    public static void rotate(int[] arr, int k){

        //apply two loops from front and back and keep replacing
        // forward loop
        if(arr == null || k <0){
            System.out.print("illigal argument");
        }
        for(int i=0; i<arr.length; i++){
            for(int j = arr.length-1; j>0; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        }

}

