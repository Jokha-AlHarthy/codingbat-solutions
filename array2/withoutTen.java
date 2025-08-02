import java.util.Arrays;

public class withoutTen {
    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;
        for(int num : nums){
            if(num != 10){
                result[pos] = num;
                pos++;
            }
        }
        return result;
    }

    //withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
    //withoutTen([10, 2, 10]) → [2, 0, 0]
    //withoutTen([1, 99, 10]) → [1, 99, 0]
    public static void main(String[]args){
        withoutTen ten = new withoutTen();
        System.out.println(Arrays.toString(ten.withoutTen(new int[]{1, 10, 10, 2})));
        System.out.println(Arrays.toString(ten.withoutTen(new int[]{10, 2, 10})));
        System.out.println(Arrays.toString(ten.withoutTen(new int[]{1, 99, 10})));
    }
}
