public class split53 {
    public boolean split53(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private boolean helper(int index, int[] nums, int sum1, int sum2){
        if(index >= nums.length){
            return sum1 == sum2;
        }

        int val = nums[index];

        if(val % 5 == 0){
            return helper(index + 1, nums, sum1 + val, sum2);
        }else if(val % 3 == 0){
            return helper(index + 1, nums, sum1, sum2 + val);
        }else if(helper(index + 1, nums, sum1 + val, sum2)){
            return true;
        }else if(helper(index + 1, nums, sum1, sum2 + val)){
            return true;
        }else{
            return false;
        }
    }

    //split53([1, 1]) → true
    //split53([1, 1, 1]) → false
    //split53([2, 4, 2]) → true
    public static void main(String[]args){
        split53 split = new split53();
        System.out.println(split.split53(new int[]{1, 1}));
        System.out.println(split.split53(new int[]{1, 1, 1}));
        System.out.println(split.split53(new int[]{2, 4, 2}));
    }
}
