import java.util.Arrays;

public class notAlone {
    public int[] notAlone(int[] nums, int val) {
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] == val && nums[i-1] != val && nums[i+1] != val){
                nums[i] = Math.max(nums[i-1], nums[i+1]);
            }
        }
        return nums;
    }


    //notAlone([1, 2, 3], 2) → [1, 3, 3]
    //notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    //notAlone([3, 4], 3) → [3, 4]
    public static void main(String[]args){
        notAlone alone = new notAlone();
        System.out.println(Arrays.toString(alone.notAlone(new int[]{1, 2, 3}, 2)));
        System.out.println(Arrays.toString(alone.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2 )));
        System.out.println(Arrays.toString(alone.notAlone(new int[]{3, 4},  3)));
    }
}
