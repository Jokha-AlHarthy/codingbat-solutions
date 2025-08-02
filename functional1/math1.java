import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class math1 {
    public List<Integer> math1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            result.add((n+1) * 10);
        }
        return result;
    }

    //math1([1, 2, 3]) → [20, 30, 40]
    //math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
    //math1([10]) → [110]
    public static void main(String[]args){
        math1 math = new math1();
        System.out.println(math.math1(Arrays.asList(1, 2, 3)));
        System.out.println(math.math1(Arrays.asList(6, 8, 6, 8, 1)));
        System.out.println(math.math1(Arrays.asList(10)));
    }

}
