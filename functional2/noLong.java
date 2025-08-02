import java.util.ArrayList;
import java.util.List;

public class noLong {
    public List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String str : strings){
            if(str.length()<4){
                result.add(str);
            }
        }
        return result;
    }

    //noLong(["this", "not", "too", "long"]) → ["not", "too"]
    //noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    //noLong(["cccc", "cccc", "cccc"]) → []
    public static void main(String[]args){
        noLong word = new noLong();
        System.out.println(word.noLong(List.of("this", "not", "too", "long")));
        System.out.println(word.noLong(List.of("a", "bbb", "cccc")));
        System.out.println(word.noLong(List.of("cccc", "cccc", "cccc")));
    }
}
