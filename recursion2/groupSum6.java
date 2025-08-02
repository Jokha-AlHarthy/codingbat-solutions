public class groupSum6 {
    public boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }else if(nums[start] == 6){
            return groupSum6(start + 1, nums, target - nums[start]);
        }else{
            if(groupSum6(start + 1, nums, target - nums[start])){
                return true;
            }else if(groupSum6(start + 1, nums, target)){
                return true;
            }else{
                return false;
            }
        }
    }

    //groupSum6(0, [5, 6, 2], 8) → true
    //groupSum6(0, [5, 6, 2], 9) → false
    //groupSum6(0, [5, 6, 2], 7) → false
    public static void main(String[]args){
        groupSum6 group = new groupSum6();
        System.out.println(group.groupSum6(0, new int[]{5, 6, 2},8));
        System.out.println(group.groupSum6(0,new int[]{5, 6, 2},9));
        System.out.println(group.groupSum6(0,new int[]{5, 6, 2},7));
    }
}
