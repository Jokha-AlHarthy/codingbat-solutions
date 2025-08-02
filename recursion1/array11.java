public class array11 {
    public int array11(int[] nums, int index) {
        if(index>= nums.length){
            return 0;
        }else if(nums[index]==11){
            return 1 + array11(nums, index + 1);
        }else{
            return array11(nums,index+1);
        }
    }

    //array11([1, 2, 11], 0) → 1
    //array11([11, 11], 0) → 2
    //array11([1, 2, 3, 4], 0) → 0
    public static void main(String[]args){
        array11 array = new array11();
        System.out.println(array.array11(new int[]{1, 2, 11},0));
        System.out.println(array.array11(new int[]{11, 11},0));
        System.out.println(array.array11(new int[]{1, 2, 3, 4},0));
    }
}
