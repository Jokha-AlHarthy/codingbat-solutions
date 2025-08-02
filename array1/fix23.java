import java.util.Arrays;

public class fix23 {
    public int[] fix23(int[] nums) {
        if(nums[0] == 2 && nums[1] == 3){
            nums[1]=0;
        }else if(nums[1] == 2 && nums[2] == 3){
            nums[2]=0;
        }
        return nums;
    }

    //fix23([1, 2, 3]) → [1, 2, 0]
    //fix23([2, 3, 5]) → [2, 0, 5]
    //fix23([1, 2, 1]) → [1, 2, 1]
    public static void main(String[]args){
        fix23 num = new fix23();
        System.out.println(Arrays.toString(num.fix23(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(num.fix23(new int[]{2, 3, 5})));
        System.out.println(Arrays.toString(num.fix23(new int[]{1, 2, 1})));
    }
}
