public class has77 {
    public boolean has77(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 7 && nums[i + 1] == 7){
                return true;
            }
            if(i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7){
                return true;
            }
        }
        return false;
    }

    //has77([1, 7, 7]) → true
    //has77([1, 7, 1, 7]) → true
    //has77([1, 7, 1, 1, 7]) → false
    public static void main(String[]args){
        has77 num = new has77();
        System.out.println(num.has77(new int[]{1, 7, 7}));
        System.out.println(num.has77(new int[]{1, 7, 1, 7}));
        System.out.println(num.has77(new int[]{1, 7, 1, 1, 7}));
    }
}
