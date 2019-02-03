/*We have a number of bunnies and each bunny has two big
 floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4*/


public class solution {
    public static void main(String[] args){
        int bunny = 3;
        int result = bunnyEar(bunny);
        System.out.print(result);

    }
    public static int bunnyEar(int bunny){
        if(bunny == 0){
            return 0;
        }
        //atleast 1 bunny will have 2 ear
        return 2 + bunnyEar(bunny - 1);
        ret
    }

}
