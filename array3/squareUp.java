import java.util.Arrays;

public class squareUp {
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                result[i * n - j - 1] = j + 1;
            }
        }
        return result;
    }

    //squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
    //squareUp(2) → [0, 1, 2, 1]
    //squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
    public static void main(String[]args){
        squareUp up = new squareUp();
        System.out.println(Arrays.toString(up.squareUp(3)));
        System.out.println(Arrays.toString(up.squareUp(2)));
        System.out.println(Arrays.toString(up.squareUp(4)));
    }

}
