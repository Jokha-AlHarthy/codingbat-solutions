import java.util.Arrays;

public class evenOdd {
    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenPos = 0;
        for(int num : nums){
            if(num % 2 == 0){
                result[evenPos] = num;
                evenPos++;
            }
        }
        for(int num : nums){
            if(num % 2 != 0){
                result[evenPos] = num;
                evenPos++;
            }
        }
        return result;
    }

    //evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    //evenOdd([3, 3, 2]) → [2, 3, 3]
    //evenOdd([2, 2, 2]) → [2, 2, 2]
    public static void main(String[]args){
        evenOdd odd = new evenOdd();
        System.out.println(Arrays.toString(odd.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));
        System.out.println(Arrays.toString(odd.evenOdd(new int[]{3, 3, 2})));
        System.out.println(Arrays.toString(odd.evenOdd(new int[]{2, 2, 2})));
    }
}
