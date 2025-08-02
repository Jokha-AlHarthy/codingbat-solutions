public class isEverywhere {
    public boolean isEverywhere(int[] nums, int val){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != val && nums[i + 1] != val){
                return false;
            }
        }
        return true;
    }

    //isEverywhere([1, 2, 1, 3], 1) → true
    //isEverywhere([1, 2, 1, 3], 2) → false
    //isEverywhere([1, 2, 1, 3, 4], 1) → false
    public static void main(String[]args){
        isEverywhere everywhere= new isEverywhere();
        System.out.println(everywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        System.out.println(everywhere.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        System.out.println(everywhere.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
    }
}
