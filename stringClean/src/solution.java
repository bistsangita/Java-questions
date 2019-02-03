/*Given a string, return recursively a "cleaned" string where adjacent chars that are the
same have been reduced to a single char. So "yyzzza" yields "yza".

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"*/



public class solution {
    public static void main(String[] args){
        String input  = "yyzzza";
        String result = stringClean(input);
        System.out.print(result);


    }
    public static String stringClean(String input) {
        // more than one char can have repeat chr , chk here
        if (input.length() < 2) return input;
        //if adjacent chars are equal than call the function form last one char (remove first same char ),
        if (input.charAt(0) == input.charAt(1))
            return stringClean(input.substring(1));
        else
            return input.charAt(0) + stringClean(input.substring(1));
    }
}
