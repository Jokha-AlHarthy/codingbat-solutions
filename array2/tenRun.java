import java.util.Arrays;

public class tenRun {
    public int[] tenRun(int[] nums) {
        Integer current = null;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 10 == 0){
                current = nums[i];
            }else if(current != null){
                nums[i] = current;
            }
        }
        return nums;
    }

    //tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    //tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    //tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
    public static void main(String[]args){
        tenRun run = new tenRun();
        System.out.println(Arrays.toString(run.tenRun(new int[]{2, 10, 3, 4, 20, 5})));
        System.out.println(Arrays.toString(run.tenRun(new int[]{10, 1, 20, 2})));
        System.out.println(Arrays.toString(run.tenRun(new int[]{10, 1, 9, 20})));
    }
}
