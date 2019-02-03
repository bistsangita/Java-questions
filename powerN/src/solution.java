/*Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
 so powerN(3, 2) is 9 (3 squared).
powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27*/


public class solution {
    public static void main(String[] args){
        int base = 3;
        int power = 2;
        int result = powerN(base, power);
        System.out.print(result);

    }
    public static int powerN(int base , int power){
        if(power == 0){
            return 1;

        }
        //
        return base * powerN(base, power-1);
    }
}
