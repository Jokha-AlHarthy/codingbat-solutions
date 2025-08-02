public class sum13 {
    public int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 13){
                i++;
            }else{
                sum += nums[i];
            }
        }
        return sum;
    }

    //sum13([1, 2, 2, 1]) → 6
    //sum13([1, 1]) → 2
    //sum13([1, 2, 2, 1, 13]) → 6
    public static void main(String[]args){
        sum13 num = new sum13();
        System.out.println(num.sum13(new int[]{1, 2, 2, 1}));
        System.out.println(num.sum13(new int[]{1, 1}));
        System.out.println(num.sum13(new int[]{1, 2, 2, 1, 13}));
    }
}
