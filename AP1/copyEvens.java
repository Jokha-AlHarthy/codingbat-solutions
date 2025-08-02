import java.util.Arrays;

public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[]result = new int[count];
        int index = 0;
        for(int num : nums){
            if(num % 2 == 0){
                result[index] = num;
                index++;
                if(index == count){
                    break;
                }
            }
        }
        return result;
    }

    //copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
    //copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
    //copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
    public static void main(String[]args){
        copyEvens even = new copyEvens();
        System.out.println(Arrays.toString(even.copyEvens(new int[]{3, 2, 4, 5, 8}, 2)));
        System.out.println(Arrays.toString(even.copyEvens(new int[]{3, 2, 4, 5, 8}, 3)));
        System.out.println(Arrays.toString(even.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3)));
    }
}
