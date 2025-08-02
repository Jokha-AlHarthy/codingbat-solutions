public class bigDiff {
    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }
        return max - min;
    }

    //bigDiff([10, 3, 5, 6]) → 7
    //bigDiff([7, 2, 10, 9]) → 8
    //bigDiff([2, 10, 7, 2]) → 8
    public static void main(String[]args){
        bigDiff diff = new bigDiff();
        System.out.println(diff.bigDiff(new int[]{10, 3, 5, 6}));
        System.out.println(diff.bigDiff(new int[]{7, 2, 10, 9}));
        System.out.println(diff.bigDiff(new int[]{2, 10, 7, 2}));
    }
}
