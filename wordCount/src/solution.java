
/*The classic word-count algorithm: given an array of strings,
return a Map<String, Integer> with a key for each different string,
 with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}*/


import java.util.*;

public class solution {
    public static void main(String[] args){
        String[] str = {"a", "b", "a", "c", "b"};

       for (Map.Entry<String, Integer> e : wordCount(str).entrySet()) {
           System.out.println("key = " + e.getKey() + " , value = " + e.getValue());
       }

//       Map<String, Integer> result =  wordCount(str);
//        Set<String> set = result.keySet();
//        Set<String> p = new HashSet<>();
//       for (String s : p) {
//           System.out.println("key = " + s + " , value = " + result.get(s));
//       }


    }
    public static HashMap<String, Integer> wordCount(String[] str){
        HashMap<String, Integer> mymap = new HashMap();
        //for every string in array
        for(String a : str){
            if(!mymap.containsKey(a)){    //check if key is not avl and put
                mymap.put(a,1);
            }
            else {
                int temp = mymap.get(a);    //get value of key and increase it
                mymap.put(a,temp+1);
            }
        }
        return mymap;
    }


}
