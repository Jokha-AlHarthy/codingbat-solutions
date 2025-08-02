import java.util.Arrays;

public class canBalance {
    public boolean canBalance(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length - 1; i++){
            leftSum += nums[i];
            if(leftSum == totalSum - leftSum) {
                return true;
            }
        }
        return false;
    }


    //canBalance([1, 1, 1, 2, 1]) → true
    //canBalance([2, 1, 1, 2, 1]) → false
    //canBalance([10, 10]) → true
    public static void main(String[]args){
        canBalance balance = new canBalance();
        System.out.println(balance.canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(balance.canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(balance.canBalance(new int[]{10, 10}));
    }
}
