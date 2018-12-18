/*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
 and otherwise return the string unchanged.

 withoutX2("xHi") → "Hi"
 withoutX2("Hxi") → "Hi"
 withoutX2("Hi") → "Hi"*/


public class solution {
    public static void main(String[] args){
        String str = "xHi";
       String result =  withoutX(str);
       System.out.print(result);

    }

    public  static String withoutX(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != 'x') {
                temp =temp+ str.charAt(i);
            }

        else if (i == 1 && str.charAt(i) != 'x')

            temp = temp + str.charAt(i);

        else if (i > 1)
            temp = temp + str.charAt(i);
        }
        return temp;

    }

}


