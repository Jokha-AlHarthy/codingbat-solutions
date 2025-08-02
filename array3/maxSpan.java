public class maxSpan {
    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j >= i; j--){
                if(nums[i] == nums[j]){
                    int span = j - i + 1;
                    if(span > maxSpan){
                        maxSpan = span;
                    }
                    break;
                }
            }
        }
        return maxSpan;
    }

    //maxSpan([1, 2, 1, 1, 3]) → 4
    //maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    //maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
    public static void main(String[]args){
        maxSpan max = new maxSpan();
        System.out.println(max.maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(max.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println(max.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}
