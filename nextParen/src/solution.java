/*Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
 like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false*/

public class solution {
    public static void main(String[] args){
        String input = "(())";
        boolean result = nextParen(input);
        System.out.print(result);


    }
    public static boolean nextParen(String input) {
        //chk if input is empty or have less than one pair of paren
        if (input == null || input.length() < 2) {
            return false;
        }
        //most inside paren
        if(input.length()==2){
            if(input.charAt(0)=='(' && input.charAt(1)==')') {
                return true;
            }
        }
//        if(input.length() ==0){
//            return false;
//        }
        //first char is open paren
        if (input.charAt(0) == '(') {
            //now chk last paren is close
            if (input.charAt(input.length() - 1) == ')') {
                //recur on whats inside
                //it will chk from 1 to second last char
                //0th is '(' .... last is ')'
                return nextParen(input.substring(1, (input.length() - 1))); //how to put these two together
                //return true;
            }
            else {
                //chk the close paren from last and recur
                return nextParen(input.substring(input.length()-1));
            }
        } else {
            //start checking from next char
            return nextParen(input.substring(1));
        }

    }

}
