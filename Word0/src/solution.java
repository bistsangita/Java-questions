/*Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 always with the value 0. For example the string "hello" makes the pair "hello":0.
  We'll do more complicated counting later, but for this problem the value is simply 0.


        word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
        word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
        word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
        */

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args){
        String[] str = {"a", "b", "a", "b", "c", "d","a"};
        for (Map.Entry<String, Integer> e : word0(str).entrySet()) {
            System.out.println("key = " + e.getKey() + " , value = " + e.getValue());
        }



    }
    public static HashMap<String , Integer> word0(String[] str){
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : str){
            //if map doesn't have this key , then put key and its value 0
            if(!map.containsKey(s)){
                map.put(s,0);
            }
            //put the key and value
            map.put(s, map.get(s));
        }
        return map;

    }
}
