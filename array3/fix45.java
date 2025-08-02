import java.util.Arrays;

public class fix45 {
    public int[] fix45(int[] nums) {
        int n = nums.length;
        int fiveIndex = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 4){
                while(fiveIndex < n){
                    if(nums[fiveIndex] == 5 && (fiveIndex == 0 || nums[fiveIndex - 1] != 4)) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[fiveIndex];
                        nums[fiveIndex] = temp;
                        fiveIndex++;
                        break;
                    }
                    fiveIndex++;
                }
            }
        }
        return nums;
    }

    //fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
    //fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
    //fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
    public static void main(String[]args){
        fix45 fix = new fix45();
        System.out.println(Arrays.toString(fix.fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(Arrays.toString(fix.fix45(new int[]{1, 4, 1, 5})));
        System.out.println(Arrays.toString(fix.fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
    }
}
