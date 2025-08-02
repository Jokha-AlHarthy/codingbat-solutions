import java.util.ArrayList;
import java.util.List;

public class sqaure56 {
    public List<Integer> square56(List<Integer> nums) {
        List<Integer>result =  new ArrayList<>();
        for(int n : nums){
            int transFormed = n * n + 10;
            int lastDigit = transFormed % 10;
            if(lastDigit != 5 && lastDigit != 6){
                result.add(transFormed);
            }
        }
        return result;
    }

    //square56([3, 1, 4]) → [19, 11]
    //square56([1]) → [11]
    //square56([2]) → [14]
    public static void main(String[]args){
        sqaure56 sqaure = new sqaure56();
        System.out.println(sqaure.square56(List.of(3, 1, 4)));
        System.out.println(sqaure.square56(List.of(1)));
        System.out.println(sqaure.square56(List.of(2)));
    }
}
