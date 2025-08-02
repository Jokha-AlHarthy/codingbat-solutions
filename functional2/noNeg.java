import java.util.ArrayList;
import java.util.List;

public class noNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            if(n>=0){
                result.add(n);
            }
        }
        return result;
    }


    //noNeg([1, -2]) → [1]
    //noNeg([-3, -3, 3, 3]) → [3, 3]
    //noNeg([-1, -1, -1]) → []
    public static void main(String[]args){
        noNeg negative = new noNeg();
        System.out.println(negative.noNeg(List.of(1, -2)));
        System.out.println(negative.noNeg(List.of(-3, -3, 3, 3)));
        System.out.println(negative.noNeg(List.of(-1, -1, -1)));
    }
}
