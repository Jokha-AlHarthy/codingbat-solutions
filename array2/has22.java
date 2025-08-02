public class has22 {
    public boolean has22(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 2){
                return true;
            }
        }
        return false;
    }

    //has22([1, 2, 2]) → true
    //has22([1, 2, 1, 2]) → false
    //has22([2, 1, 2]) → false
    public static void main(String[]args){
        has22 num = new has22();
        System.out.println(num.has22(new int[]{1, 2, 2}));
        System.out.println(num.has22(new int[]{1, 2, 1, 2}));
        System.out.println(num.has22(new int[]{2, 1, 2}));
    }
}
