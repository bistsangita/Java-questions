/*Given a non-negative int n, return the sum of its digits recursively (no loops).
 Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3*/

public class solution {
    public static void main(String[] args){
        int num = 121;
        int result = sumDigits(num);
        System.out.print(result);

    }
    public static int sumDigits(int num){
        //if num is one digit ,no need for sum ,just return it self

        //yesterday i put base condition wrong , most of the result were correct but some of not ..now its correct
        if(num < 10){
            return num;

        }
        //take the last digit in every recursive loop
        int lastdigit = num%10;
        //call this for whole num
        int sum = sumDigits(num/10) + lastdigit;
        return sum;
    }
}
