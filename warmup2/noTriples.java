public class noTriples {
    public boolean noTriples(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == nums[i + 1] && nums[i] == nums[i + 2]){
                return false;
            }
        }
        return true;
    }

    //noTriples([1, 1, 2, 2, 1]) → true
    //noTriples([1, 1, 2, 2, 2, 1]) → false
    //noTriples([1, 1, 1, 2, 2, 2, 1]) → false
    public static void main(String[]args){
        noTriples num = new noTriples();
        System.out.println(num.noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(num.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(num.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}
