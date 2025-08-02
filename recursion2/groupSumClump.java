public class groupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }

        int i = start;
        int sum = 0;
        while(i < nums.length && nums[i] == nums[start]){
            sum += nums[i];
            i++;
        }

        if(groupSumClump(i, nums, target - sum)){
            return true;
        }else if(groupSumClump(i, nums, target)){
            return true;
        }else{
            return false;
        }
    }

    //groupSumClump(0, [2, 4, 8], 10) → true
    //groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
    //groupSumClump(0, [2, 4, 4, 8], 14) → false
    public static void main(String[]args){
        groupSumClump group = new groupSumClump();
        System.out.println(group.groupSumClump(0, new int[]{2, 4, 8},10));
        System.out.println(group.groupSumClump(0,new int[]{1, 2, 4, 8, 1},14));
        System.out.println(group.groupSumClump(0,new int[]{2, 4, 4, 8},14));
    }
}
