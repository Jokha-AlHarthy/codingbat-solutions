import java.util.Arrays;

public class post4 {
    public int[] post4(int[] nums) {
        int lastIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 4) {
                lastIndex = i;
            }
        }
        int newLength = nums.length - lastIndex - 1;
        int[] result = new int[newLength];
        for(int i = 0; i < newLength; i++){
            result[i] = nums[lastIndex + 1 + i];
        }

        return result;
    }

    //post4([2, 4, 1, 2]) → [1, 2]
    //post4([4, 1, 4, 2]) → [2]
    //post4([4, 4, 1, 2, 3]) → [1, 2, 3]
    public static void main(String[]args){
        post4 post = new post4();
        System.out.println(Arrays.toString(post.post4(new int[]{2, 4, 1, 2})));
        System.out.println(Arrays.toString(post.post4(new int[]{4, 1, 4, 2})));
        System.out.println(Arrays.toString(post.post4(new int[]{4, 4, 1, 2, 3})));
    }
}
