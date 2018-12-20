
/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/

public class solutoin {
    public static void main(String[] args) {
        String a = "xxcaazz";
        String b = "xxbaaz";
        int result = stringMatch(a,b);
        System.out.println(result);
        //stringMatch(a, b);

        a = "abc";
        b = "abc";
        result = stringMatch(a,b);
        System.out.println(result);



        a = "abc";
        b = "axc";
        result = stringMatch(a,b);
        System.out.println(result);



    }

    //    public static int stringMatch(String a , String b){
//        //check if string is not empty
//
//        //string to char array
//        char[] char_a = a.toCharArray();
//        char[] char_b = b.toCharArray();
////        for(int i=0; i<char_a.length ; i++){
////            System.out.print(char_a[i]);
////        }
//        //check if char_a is bigger
//
//        int counter = 0;
//        int j =0;
//        for(int i=0; i<char_a.length; i++){
//            if(char_a[i] == char_b[j] && char_a[i+1] == char_b[j+1]){
//                counter = counter+1;
//            }
//            j++;
//        }
//        return counter;
//
//    }
//}
    public static int stringMatch(String a, String b) {
        // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        int j=0;
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(j, j + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
            j++;
        }

        return count;
    }
}