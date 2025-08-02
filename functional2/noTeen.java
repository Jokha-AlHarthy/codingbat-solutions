import java.util.ArrayList;
import java.util.List;

public class noTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            if(n<13 || n >19){
                result.add(n);
            }
        }
        return result;
    }

    //noTeen([12, 13, 19, 20]) → [12, 20]
    //noTeen([1, 14, 1]) → [1, 1]
    //noTeen([15]) → []
    public static void main(String[]args){
        noTeen num = new noTeen();
        System.out.println(num.noTeen(List.of(12, 13, 19, 20)));
        System.out.println(num.noTeen(List.of(1, 14, 1)));
        System.out.println(num.noTeen(List.of(15)));
    }
}
