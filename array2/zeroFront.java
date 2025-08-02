import java.util.Arrays;

public class zeroFront {
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;
        for(int num : nums){
            if(num == 0){
                result[pos] = 0;
                pos++;
            }
        }
        for(int num : nums){
            if(num != 0){
                result[pos] = num;
                pos++;
            }
        }
        return result;
    }

    //zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    //zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    //zeroFront([1, 0]) → [0, 1]
    public static void main(String[]args){
        zeroFront front = new zeroFront();
        System.out.println(Arrays.toString(front.zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println(Arrays.toString(front.zeroFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(front.zeroFront(new int[]{1, 0})));
    }

}
