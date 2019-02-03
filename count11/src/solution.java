/*Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1*/


public class solution {
    public static void main(String[] args){
        String input = "11abc11";
        int result = count11(input);
        System.out.print(result);

    }
    public static int count11(String input){
        if(input.length() <=1 ){
            return 0;
        }
        //if input is 11 itself
        if(input.substring(0,2) == "11"){
            return input.length();
        }
        //start looking from next char
        return count11(input.substring(1));

    }

}
