public class has23 {
    public boolean has23(int[] nums) {
        if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3){
            return true;
        }else{
            return false;
        }
    }

    //has23([2, 5]) → true
    //has23([4, 3]) → true
    //has23([4, 5]) → false
    public static void main(String[]args){
        has23 num = new has23();
        System.out.println(num.has23(new int[]{2, 5}));
        System.out.println(num.has23(new int[]{4, 3}));
        System.out.println(num.has23(new int[]{4, 5}));
    }
}
