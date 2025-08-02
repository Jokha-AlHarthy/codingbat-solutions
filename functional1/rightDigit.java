import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            result.add(n%10);
        }
        return result;
    }

    //rightDigit([1, 22, 93]) → [1, 2, 3]
    //rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
    //rightDigit([10, 0]) → [0, 0]
    public static void main(String[]args){
        rightDigit digit = new rightDigit();
        System.out.println(digit.rightDigit(Arrays.asList(1, 22, 93)));
        System.out.println(digit.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        System.out.println(digit.rightDigit(Arrays.asList(10, 0)));
    }

}
