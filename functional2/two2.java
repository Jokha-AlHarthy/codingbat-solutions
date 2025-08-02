import java.util.ArrayList;
import java.util.List;

public class two2 {
    public List<Integer> two2(List<Integer> nums) {
        List<Integer>result = new ArrayList<>();
        for(int num : nums){
            int doubled = num * 2;
            if(doubled % 10 != 2){
                result.add(doubled);
            }
        }
        return result;
    }

    //two2([1, 2, 3]) → [4, 6]
    //two2([2, 6, 11]) → [4]
    //two2([0]) → [0]
    public static void main(String[]args){
        two2 n = new two2();
        System.out.println(n.two2(List.of(1, 2, 3)));
        System.out.println(n.two2(List.of(2, 6, 11)));
        System.out.println(n.two2(List.of(0)));
    }
}
