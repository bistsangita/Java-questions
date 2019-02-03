/*We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
 Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2*/


public class solution {
    public static void main(String[] args){
        int smallbar = 4;
        int bigbar = 1;
        int goal = 7;
        int result = makeChocolate(4,1,7);
        System.out.print(result);

    }
    public static int makeChocolate(int smallbar, int bigbar , int goal){
        int bigbar_ActualValue = bigbar*5;

        //chk if small bar and big bar is exact enough to make goal chocolate,then ans is small bars
        if((smallbar + bigbar_ActualValue) == goal){
            return smallbar;
        }
        //if not enough small bars
        if((smallbar+bigbar_ActualValue) < goal){
            return -1;
        }
        //if goal is small than given values
        if((smallbar + bigbar_ActualValue) > goal){
            return (goal - bigbar_ActualValue);
        }

        return -1;
    }


}
