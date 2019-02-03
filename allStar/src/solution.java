/*Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/


public class solution {
    public static void main(String[] args){
        String input = "abc";
        String result = allStar(input);
        System.out.print(result);

    }
    public static String allStar(String input){
        char star= '*';
        if(input.length() < 2){
            return input;
        }
       if(input.charAt(1) != 0){
            return input.charAt(0) + "*" + allStar(input.substring(1));


       }
       return input;

    }
}
