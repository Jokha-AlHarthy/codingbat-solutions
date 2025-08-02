import java.util.Arrays;

public class seriesUp {
    public int[] seriesUp(int n) {
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        int index = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                result[index++] = j;
            }
        }
        return result;
    }

    //seriesUp(3) → [1, 1, 2, 1, 2, 3]
    //seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
    //seriesUp(2) → [1, 1, 2]
    public static void main(String[]args){
        seriesUp up = new seriesUp();
        System.out.println(Arrays.toString(up.seriesUp(3)));
        System.out.println(Arrays.toString(up.seriesUp(4)));
        System.out.println(Arrays.toString(up.seriesUp(2)));
    }
}
