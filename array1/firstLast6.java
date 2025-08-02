public class firstLast6 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        }else if(nums[nums.length - 1] == 6){
            return true;
        }
        return false;
    }


    //firstLast6([1, 2, 6]) → true
    //firstLast6([6, 1, 2, 3]) → true
    //firstLast6([13, 6, 1, 2, 3]) → false
    public static void main(String[]args){
        firstLast6 num = new firstLast6();
        System.out.println(num.firstLast6(new int[]{1, 2, 6}));
        System.out.println(num.firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(num.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
}
