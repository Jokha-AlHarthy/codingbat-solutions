import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class doubling {
    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            result.add(n*2);
        }
        return result;
    }

    //doubling([1, 2, 3]) → [2, 4, 6]
    //doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    //doubling([]) → []
    public static void main(String[]args){
        doubling num = new doubling();
        System.out.println(num.doubling(Arrays.asList(1, 2, 3)));
        System.out.println(num.doubling(Arrays.asList(6, 8, 6, 8, -1)));
        System.out.println(num.doubling(Arrays.asList()));

    }
}
