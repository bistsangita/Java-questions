/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is the same length
 as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"*/

public class solution {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hi";
        String result = minCat(a,b);
        System.out.println(result);

        String c  = "Hello" ;
        String d = "java";
        result = minCat(c,d);
        System.out.println(result);



    }

    public static String minCat(String a, String b) {
        if (a.length() == b.length())
            return a + b;
        if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;

        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }

    }
}