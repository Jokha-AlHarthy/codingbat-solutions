import java.util.Arrays;

public class fix34 {
    public int[] fix34(int[] nums) {
        int n = nums.length;
        int fourIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 3) {
                for (; fourIndex < n; fourIndex++) {
                    if (nums[fourIndex] == 4) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[fourIndex];
                        nums[fourIndex] = temp;
                        fourIndex++;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    //fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    //fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    //fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
    public static void main(String[]args){
        fix34 fix = new fix34();
        System.out.println(Arrays.toString(fix.fix34(new int[]{1, 3, 1, 4})));
        System.out.println(Arrays.toString(fix.fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println(Arrays.toString(fix.fix34(new int[]{1, 3, 1, 4})));
    }
}
