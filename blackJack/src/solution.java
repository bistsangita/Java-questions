/*Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19*/


public class solution {
    public static void main(String[] args){
        int num1 = 19;
        int num2 = 22;
        int target = 21;

        int result = blackJack(num1, num2, target);
        System.out.print(result);
    }
    public static int blackJack(int num1, int num2 , int target){
        if(num1 > target && num2 > target){
            return 0;
        }
        if(num1>target){
            return num2;
        }
        if(num2>target){
            return num1;
        }

        int gap_first = target-num1;
        int gap_second = target-num2;
//        if(gap_first == gap_second){
//            return num1;     //return anyone , both are equal doesn't matter
//        }

        if(gap_first>= gap_second){
            return num2;
        }
        if(gap_second >= gap_first){
            return num1;
        }
        return 0;


    }
}
