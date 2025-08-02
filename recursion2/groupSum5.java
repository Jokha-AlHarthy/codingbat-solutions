public class groupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }else if(nums[start] % 5 == 0){
            if(start + 1 < nums.length && nums[start + 1] == 1){
                return groupSum5(start + 2, nums, target - nums[start]);
            }else{
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }else if(groupSum5(start + 1, nums, target - nums[start])){
            return true;
        }else if(groupSum5(start + 1, nums, target)){
            return true;
        }else{
            return false;
        }
    }

    //groupSum5(0, [2, 5, 10, 4], 19) → true
    //groupSum5(0, [2, 5, 10, 4], 17) → true
    //groupSum5(0, [2, 5, 10, 4], 12) → false
    public static void main(String[]args){
        groupSum5 group = new groupSum5();
        System.out.println(group.groupSum5(0, new int[]{2, 5, 10, 4},19));
        System.out.println(group.groupSum5(0,new int[]{2, 5, 10, 4},17));
        System.out.println(group.groupSum5(0,new int[]{2, 5, 10, 4},12));
    }
}
