public class no23 {
    public boolean no23(int[] nums) {
        if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3){
            return false;
        }else{
            return true;
        }
    }

    //no23([4, 5]) → true
    //no23([4, 2]) → false
    //no23([3, 5]) → false
    public static void main(String[]args){
        no23 num = new no23();
        System.out.println(num.no23(new int[]{4, 5}));
        System.out.println(num.no23(new int[]{4, 2}));
        System.out.println(num.no23(new int[]{3, 5}));
    }
}
