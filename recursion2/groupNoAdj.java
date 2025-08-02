public class groupNoAdj {
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }else if(groupNoAdj(start + 2, nums, target - nums[start])){
            return true;
        }else if(groupNoAdj(start + 1, nums, target)){
            return true;
        }else{
            return false;
        }
    }

    //groupNoAdj(0, [2, 5, 10, 4], 12) → true
    //groupNoAdj(0, [2, 5, 10, 4], 14) → false
    //groupNoAdj(0, [2, 5, 10, 4], 7) → false
    public static void main(String[]args){
        groupNoAdj group = new groupNoAdj();
        System.out.println(group.groupNoAdj(0, new int[]{2, 5, 10, 4},12));
        System.out.println(group.groupNoAdj(0,new int[]{2, 5, 10, 4},14));
        System.out.println(group.groupNoAdj(0,new int[]{2, 5, 10, 4},7));
    }
}
