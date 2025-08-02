import java.util.Arrays;

public class fizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for(int i = 0; i < result.length; i++){
            result[i] = start + i;
        }
        return result;
    }

    //fizzArray3(5, 10) → [5, 6, 7, 8, 9]
    //fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
    //fizzArray3(1, 3) → [1, 2]
    public static void main(String[]args){
        fizzArray3 fizz = new fizzArray3();
        System.out.println(Arrays.toString(fizz.fizzArray3(5, 10)));
        System.out.println(Arrays.toString(fizz.fizzArray3(11, 18)));
        System.out.println(Arrays.toString(fizz.fizzArray3(1, 3)));
    }
}
