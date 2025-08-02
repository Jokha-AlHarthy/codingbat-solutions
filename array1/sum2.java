public class sum2 {
    public int sum2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }else{
            return nums[0] + nums[1];
        }
    }

    //sum2([1, 2, 3]) → 3
    //sum2([1, 1]) → 2
    //sum2([1, 1, 1, 1]) → 2
    public static void main(String[]args){
        sum2 addition = new sum2();
        System.out.println(addition.sum2(new int[]{1, 2, 3}));
        System.out.println(addition.sum2(new int[]{1, 1}));
        System.out.println(addition.sum2(new int[]{1, 1, 1, 1}));

    }
}
