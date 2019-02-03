/*We'll say that a "pair" in a string is two instances of a char separated by a char.
So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
Recursively compute the number of pairs in the given string.

countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1*/


public class solution {
    public static void main(String[] args) {
        String input = "aaaaa";
        int result = countPair(input);
        System.out.print(result);

    }
    public static int countPair(String input){
        //if string size is only two char or less , then no pair is possible
        if (input.length() <= 2) {
            return 0;
        }
        //if first and 3rd char would match , thats a pair and find more pair from 2nd char (overlap possible)
        //in case of all char same , it will count pairs,sep by one char in middle according to que
        if (input.charAt(0) == input.charAt(2)) {
            return 1 + countPair(input.substring(1));
        }

        return countPair(input.substring(1));
    }

}


