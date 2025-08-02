public class either24 {
    public boolean either24(int[] nums){
        boolean has22 = false;
        boolean has44 = false;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 2){
                has22 = true;
            }else if(nums[i] == 4 && nums[i + 1] == 4){
                has44 = true;
            }
        }
        return has22 ^ has44;
    }

    //either24([1, 2, 2]) → true
    //either24([4, 4, 1]) → true
    //either24([4, 4, 1, 2, 2]) → false
    public static void main(String[]args){
        either24 either = new either24();
        System.out.println(either.either24(new int[]{1, 2, 2}));
        System.out.println(either.either24(new int[]{4, 4, 1}));
        System.out.println(either.either24(new int[]{4, 4, 1, 2, 2}));
    }
}
