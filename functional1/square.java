import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class square {
    public List<Integer> square(List<Integer> nums) {
        List<Integer>result = new ArrayList<>();
        for(int n: nums){
            result.add(n*n);
        }
        return result;
    }

    //square([1, 2, 3]) → [1, 4, 9]
    //square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    //square([]) → []
    public static void main(String[]args){
        square sq = new square();
        System.out.println(sq.square(Arrays.asList(1, 2, 3)));
        System.out.println(sq.square(Arrays.asList(6, 8, -6, -8, 1)));
        System.out.println(sq.square(Arrays.asList(

        )));
    }

}
