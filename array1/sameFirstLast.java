public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if(nums.length >= 1){
            if(nums[0] == nums[nums.length - 1]){
                return true;
            }
        }
        return false;
    }

    //sameFirstLast([1, 2, 3]) → false
    //sameFirstLast([1, 2, 3, 1]) → true
    //sameFirstLast([1, 2, 1]) → true
    public static void main(String[]args){
        sameFirstLast num = new sameFirstLast();
        System.out.println(num.sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(num.sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(num.sameFirstLast(new int[]{1, 2, 1}));
    }
}
