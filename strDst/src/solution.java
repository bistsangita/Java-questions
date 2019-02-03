/*Given a string and a non-empty substring sub, compute recursively the largest substring which
 starts and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("ccatcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9*/


public class solution {
    public static void main(String[] args) {
        String input = "catcattt";
        String sub = "cat";
        int result = strDist(input, sub);
        System.out.print(result);
    }
    public static int strDist(String input , String sub){
        //string should be greater than sub
        if (input.length() < sub.length()) {
            return 0;
        }
        //chk input start with sub.
        if (input.startsWith(sub)) {
            if (input.endsWith(sub)) {
                return input.lastIndexOf(sub)+ sub.length() ;
            }
            //does not end with sub , return the length of sub .
            else{
                //return sub.length();
                //count the length of the
                return input.substring(input.substring(input.length()-1),sub);


            }

        }
        else{
            strDist(input.substring(0, input.length()-2),sub);

        }

        //start looking from next char of string
        return strDist(input.substring(1), sub);

    }

}
