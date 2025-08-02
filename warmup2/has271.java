public class has271 {
    public boolean has271(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            int val = nums[i];
            if(nums[i + 1] == val + 5 && Math.abs(nums[i + 2] - (val - 1)) <= 2){
                return true;
            }
        }
        return false;
    }

    //has271([1, 2, 7, 1]) → true
    //has271([1, 2, 8, 1]) → false
    //has271([2, 7, 1]) → true
    public static void main(String[]args){
        has271 has = new has271();
        System.out.println(has.has271(new int[]{1, 2, 7, 1}));
        System.out.println(has.has271(new int[]{1, 2, 8, 1}));
        System.out.println(has.has271(new int[]{2, 7, 1}));
    }
}
