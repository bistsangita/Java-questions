

/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/

public class solution {
    public static void main(String[] args){
        String a = "xxcaazz";
        String b = "xxbaaz";
        int result = stringMatch(a,b);
        System.out.print(result);

        a = "abc";
        b = "abc";
       // int result1 = stringMatch(a,b);
        //System.out.print(result1);    (NOT WORKING FOR THIS INPUT , WILL FIX)

    }
    public static int stringMatch(String a , String b){
        //check if string is not empty

        //string to char array
        char[] char_a = a.toCharArray();
        char[] char_b = b.toCharArray();

        int counter = 0;
        int j =0;
        for(int i=0; i<char_a.length-2; i++){   //to prevent index outofbound, should stop before end for i+1
            if(char_a[i] == char_b[j] && char_a[i+1] == char_b[j+1]){
                counter = counter+1;
            }
            j++;
        }
        return counter;

    }
}
