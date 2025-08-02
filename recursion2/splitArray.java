public class splitArray {
    public boolean splitArray(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private boolean helper(int index, int[] nums, int sum1, int sum2){
        if(index >= nums.length){
            return sum1 == sum2;
        }else if(helper(index + 1, nums, sum1 + nums[index], sum2)){
            return true;
        }else if(helper(index + 1, nums, sum1, sum2 + nums[index])){
            return true;
        }else{
            return false;
        }
    }


    //splitArray([2, 2]) → true
    //splitArray([2, 3]) → false
    //splitArray([5, 2, 3]) → true
    public static void main(String[]args){
        splitArray split = new splitArray();
        System.out.println(split.splitArray(new int[]{2, 2}));
        System.out.println(split.splitArray(new int[]{2, 3}));
        System.out.println(split.splitArray(new int[]{5, 2, 3}));
    }
}
