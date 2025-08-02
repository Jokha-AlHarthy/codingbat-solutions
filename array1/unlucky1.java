public class unlucky1 {
    public boolean unlucky1(int[] nums) {
        if(nums.length >= 2){
            if(nums[0] == 1 && nums[1] == 3){
                return true;
            }else if(nums[1] == 1 && nums.length > 2 && nums[2] == 3){
                return true;
            }else if(nums[nums.length - 2] == 1 && nums[nums.length- 1] == 3){
                return true;
            }
        }
        return false;
    }

    //unlucky1([1, 3, 4, 5]) → true
    //unlucky1([2, 1, 3, 4, 5]) → true
    //unlucky1([1, 1, 1]) → false
    public static void main(String[]args){
        unlucky1 num = new unlucky1();
        System.out.println(num.unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(num.unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(num.unlucky1(new int[]{1, 1, 1}));
    }
}
