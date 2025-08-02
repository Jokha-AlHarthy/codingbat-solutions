public class array667 {
    public int array667(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)){
                count++;
            }
        }
        return count;
    }


    //array667([6, 6, 2]) → 1
    //array667([6, 6, 2, 6]) → 1
    //array667([6, 7, 2, 6]) → 1
    public static void main(String[]args){
        array667 num = new array667();
        System.out.println(num.array667(new int[]{6, 6, 2}));
        System.out.println(num.array667(new int[]{6, 6, 2, 6}));
        System.out.println(num.array667(new int[]{6, 7, 2, 6}));
    }
}
