import java.util.Arrays;

public class maxMirror {
    public int maxMirror(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j >= 0; j--){
                int length = 0;
                while(i + length < n && j - length >= 0 && nums[i + length] == nums[j - length]){
                    length++;
                }
                if (length > max){
                    max = length;
                }
            }
        }
        return max;
    }

    //maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
    //maxMirror([1, 2, 1, 4]) → 3
    //maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
    public static void main(String[]args){
        maxMirror max = new maxMirror();
        System.out.println(max.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(max.maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(max.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
}
