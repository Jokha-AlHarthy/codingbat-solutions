public class double23 {
    public boolean double23(int[] nums) {
        if(nums.length ==2){
            if(nums[0] ==2 && nums[1]==2){
                return true;
            }else if(nums[0] ==3 && nums[1]==3){
                return true;
            }
        }
        return false;
    }

    //double23([2, 2]) → true
    //double23([3, 3]) → true
    //double23([2, 3]) → false
    public static void main(String[]args){
        double23 num = new double23();
        System.out.println(num.double23(new int[]{2, 2}));
        System.out.println(num.double23(new int[]{3, 3}));
        System.out.println(num.double23(new int[]{2, 3}));
    }
}
