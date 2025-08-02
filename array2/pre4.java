import java.util.Arrays;

public class pre4 {
    public int[] pre4(int[] nums) {
        int index = 0;
        while(nums[index] != 4){
            index++;
        }
        int[] result = new int[index];
        for(int i = 0; i < index; i++){
            result[i] = nums[i];
        }
        return result;
    }

    //pre4([1, 2, 4, 1]) → [1, 2]
    //pre4([3, 1, 4]) → [3, 1]
    //pre4([1, 4, 4]) → [1]
    public static void main(String[]args){
        pre4 num = new pre4();
        System.out.println(Arrays.toString(num.pre4(new int[]{1, 2, 4, 1})));
        System.out.println(Arrays.toString(num.pre4(new int[]{3, 1, 4})));
        System.out.println(Arrays.toString(num.pre4(new int[]{1, 4, 4})));
    }
}
