public class array6 {
    public boolean array6(int[] nums, int index) {
        if(index>= nums.length){
            return false;
        }else if(nums[index]==6){
            return true;
        }else{
            return array6(nums, index + 1);
        }
    }

    //array6([1, 6, 4], 0) → true
    //array6([1, 4], 0) → false
    //array6([6], 0) → true
    public static void main(String[]args){
        array6 array = new array6();
        System.out.println(array.array6(new int[]{1, 6, 4}, 0));
        System.out.println(array.array6(new int[]{1, 4}, 0));
        System.out.println(array.array6(new int[]{6}, 0));
    }
}
