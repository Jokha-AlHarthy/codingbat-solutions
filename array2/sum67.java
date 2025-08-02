public class sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean inSection = false;
        for(int num : nums){
            if (num == 6) {
                inSection = true;
            }else if(inSection){
                if (num == 7) {
                    inSection = false;
                }
            }else{
                sum += num;
            }
        }
        return sum;
    }

    //sum67([1, 2, 2]) → 5
    //sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    //sum67([1, 1, 6, 7, 2]) → 4
    public static void main(String[]args){
        sum67 nums = new sum67();
        System.out.println(nums.sum67(new int[]{1, 2, 2}));
        System.out.println(nums.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(nums.sum67(new int[]{1, 1, 6, 7, 2}));
    }
}
