import java.util.Arrays;

public class zeroMax {
    public int[] zeroMax(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int maxOdd = 0;
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] % 2 != 0 && nums[j] > maxOdd){
                        maxOdd = nums[j];
                    }
                }
                if(maxOdd != 0){
                    nums[i] = maxOdd;
                }
            }
        }
        return nums;
    }

    //zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    //zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    //zeroMax([0, 1, 0]) → [1, 1, 0]
    public static void main(String[]args){
        zeroMax max = new zeroMax();
        System.out.println(Arrays.toString(max.zeroMax(new int[]{0, 5, 0, 3})));
        System.out.println(Arrays.toString(max.zeroMax(new int[]{0, 4, 0, 3})));
        System.out.println(Arrays.toString(max.zeroMax(new int[]{0, 1, 0})));
    }
}
