import java.util.Arrays;

public class shiftLeft {
    public int[] shiftLeft(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        int first = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    //shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    //shiftLeft([1, 2]) → [2, 1]
    //shiftLeft([1]) → [1]
    public static void main(String[]args){
        shiftLeft left = new shiftLeft();
        System.out.println(Arrays.toString(left.shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println(Arrays.toString(left.shiftLeft(new int[]{1, 2})));
        System.out.println(Arrays.toString(left.shiftLeft(new int[]{1})));
    }
}
