public class array220 {
    public boolean array220(int[] nums, int index) {
        if(index>=nums.length-1){
            return false;
        }else if(nums[index + 1] == nums[index] * 10){
            return true;
        }else{
            return array220(nums, index + 1);
        }
    }

    //array220([1, 2, 20], 0) → true
    //array220([3, 30], 0) → true
    //array220([3], 0) → false
    public static void main(String[]args){
        array220 array = new array220();
        System.out.println(array.array220(new int[]{1, 2, 20},0));
        System.out.println(array.array220(new int[]{3, 30},0));
        System.out.println(array.array220(new int[]{3},0));
    }
}
