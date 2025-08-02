public class has12 {
    public boolean has12(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] == 2){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //has12([1, 3, 2]) → true
    //has12([3, 1, 2]) → true
    //has12([3, 1, 4, 5, 2]) → true
    public static void main(String[]args){
        has12 num = new has12();
        System.out.println(num.has12(new int[]{1, 3, 2}));
        System.out.println(num.has12(new int[]{3, 1, 2}));
        System.out.println(num.has12(new int[]{3, 1, 4, 5, 2}));
    }
}
