/*Given a string, return the count of the number of times that a
substring length 2 appears in the string and also as the last 2 chars of the string
, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2*/
public class solution{
    public static void main(String[] args){
        String a = "axxxaaxx";
        int result = last2(a);
       System.out.print(result);
//
//        a = "xaxxaxaxx";
//        result = last2(a);
//        System.out.print(result);

    }
    public static int last2(String a ){

        int count =0;
        //take out last tow char of string for comparision
        String last_two = a.substring(a.length()-2);
        //System.out.print(last_two);

        //loop except last two char of string
        for(int i=0; i<a.length()-2; i++){
            String aSub = a.substring(i,i+2);
            if(aSub.equals(last_two)){
                count = count+1;
            }
        }
        return count;

    }
}