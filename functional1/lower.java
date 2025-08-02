import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lower {
    public List<String> lower(List<String> strings) {
        List<String>result = new ArrayList<>();
        for(String str : strings){
            result.add(str.toLowerCase());
        }
        return result;
    }

    //lower(["Hello", "Hi"]) → ["hello", "hi"]
    //lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    //lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
    public static void main(String[]args){
        lower low = new lower();
        System.out.println(low.lower(Arrays.asList("Hello", "Hi")));
        System.out.println(low.lower(Arrays.asList("AAA", "BBB", "ccc")));
        System.out.println(low.lower(Arrays.asList("KitteN", "ChocolaTE")));

    }
}
