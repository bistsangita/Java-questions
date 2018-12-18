/*Consider the series of numbers beginning at start and running up to but not including end,
so for example start=1 and end=5 gives the series 1, 2, 3, 4.
Return a new String[] array containing the string form of these numbers,
except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz",
 and for multiples of both 3 and 5 use "FizzBuzz". In Java,
 String.valueOf(xxx) will make the String form of an int or other type..


fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]*/

public class solution {
    public static void main(String[] args){
        int start = 1;
        int end = 6;
        String[] result = fizzBuzz(start,end);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+ " ");

        }


    }
    public static String[] fizzBuzz(int start, int end) {
        //end excluded
        String[] arr = new String[end - start];

        for(int i = start; i < end; i++) {
            //multiple of both 3 and 5
            if(i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if(i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else if(i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }

        return arr;
    }
}
