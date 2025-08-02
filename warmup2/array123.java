public class array123 {
    public boolean array123(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                return true;
            }
        }
        return false;
    }


    //array123([1, 1, 2, 3, 1]) → true
    //array123([1, 1, 2, 4, 1]) → false
    //array123([1, 1, 2, 1, 2, 3]) → true
    public static void main(String[]args){
        array123 num = new array123();
        System.out.println(num.array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(num.array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(num.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }
}
