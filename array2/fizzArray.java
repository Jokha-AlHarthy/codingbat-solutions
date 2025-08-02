import java.util.Arrays;

public class fizzArray {
    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = i;
        }
        return result;
    }

    //fizzArray(4) → [0, 1, 2, 3]
    //fizzArray(1) → [0]
    //fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    public static void main(String[]args){
        fizzArray fizz = new fizzArray();
        System.out.println(Arrays.toString(fizz.fizzArray(4)));
        System.out.println(Arrays.toString(fizz.fizzArray(1)));
        System.out.println(Arrays.toString(fizz.fizzArray(10)));

    }
}
