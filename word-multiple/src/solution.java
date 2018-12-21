/*Given an array of strings, return a Map<String, Boolean> where each different
string is a key and its value is true if that string appears 2 or more times in the array.
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}*/

import java.util.HashMap;
public class solution {
    public static void main(String[] args) {
        String[] str = {"c", "c", "c", "c"};

        for (HashMap.Entry<String, Boolean> e : wordMultiple(str).entrySet()) {
            System.out.print(e.getKey() +" : " + e.getValue() +" , ");
        }
    }

    public static HashMap<String, Boolean> wordMultiple(String[] str) {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
            for(String s : str){
                if(!map.containsKey(s)){
                    map.put(s,false);
                }
                else{
                    map.put(s,true);
                }
        }
        return map;

    }

}