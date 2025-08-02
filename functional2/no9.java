import java.util.ArrayList;
import java.util.List;

public class no9 {
    public List<Integer> no9(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            if(n%10 != 9){
                result.add(n);
            }
        }
        return result;
    }

    //no9([1, 2, 19]) → [1, 2]
    //no9([9, 19, 29, 3]) → [3]
    //no9([1, 2, 3]) → [1, 2, 3]
    public static void main(String[]args){
        no9 num = new no9();
        System.out.println(num.no9(List.of(1, 2, 19)));
        System.out.println(num.no9(List.of(9, 19, 29, 3)));
        System.out.println(num.no9(List.of(1, 2, 3)));
    }

}
