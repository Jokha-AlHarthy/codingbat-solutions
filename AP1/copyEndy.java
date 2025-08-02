import java.util.Arrays;

public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[]result = new int[count];
        int index = 0;
        for(int num : nums){
            if(isEndy(num)){
                result[index] = num;
                index++;
                if(index == count){
                    break;
                }
            }
        }
        return result;
    }

    public boolean isEndy(int n){
        return (n>= 0 && n <= 10) || (n >= 90 && n <= 100);
    }

    //copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
    //copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
    //copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
    public static void main(String[]args){
        copyEndy even = new copyEndy();
        System.out.println(Arrays.toString(even.copyEndy(new int[]{9, 11, 90, 22, 6}, 2)));
        System.out.println(Arrays.toString(even.copyEndy(new int[]{9, 11, 90, 22, 6}, 3)));
        System.out.println(Arrays.toString(even.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2)));
    }
}
