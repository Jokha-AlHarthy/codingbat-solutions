public class groupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }else if(groupSum(start + 1, nums, target - nums[start])){
            return true;
        }else if(groupSum(start + 1, nums, target)){
            return true;
        }else{
            return false;
        }
    }

    //groupSum(0, [2, 4, 8], 10) → true
    //groupSum(0, [2, 4, 8], 14) → true
    //groupSum(0, [2, 4, 8], 9) → false
    public static void main(String[]args){
        groupSum group = new groupSum();
        System.out.println(group.groupSum(0, new int[]{2, 4, 8},10));
        System.out.println(group.groupSum(0,new int[]{2, 4, 8},14));
        System.out.println(group.groupSum(0,new int[]{2, 4, 8},9));
    }
}
