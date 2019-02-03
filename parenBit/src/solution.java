/*Given a string that contains a single pair of parenthesis,
compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit "xyz(abc)123" → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"*/

/*algorithm - keep checking and eliminating  from front for '(',once you reach to '('.
no keep checking from back .once you reach to bracket ,now your input string has become bracket and its content and return it
*/
public class solution {
    public static void main(String[] args){
        //String input = "xyz(abc)123";
        //String input = "x(hello)";
        String input = "(xy)1";


        String result = parenBit(input);
        System.out.print(result);

    }
    public static String parenBit(String input){

        if(input.length()<=1){
            return input;
        }
        //eliminate all the chars  till char is '('
        if (input.charAt(0) != '(') {

            //call the function for input (not having 0th from previous)
            return parenBit(input.substring(1));
        }

        //now chk from back for ')' and keep eliminate
        if (input.charAt(input.length() - 1) != ')') {
            //call function for substring including 0th to second last
            return parenBit(input.substring(0, input.length() - 1));
        }

        return input;

    }
}
