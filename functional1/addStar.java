import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addStar {
    public List<String> addStar(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String str : strings){
            result.add(str+"*");
        }
        return result;
    }

    //addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
    //addStar(["hello", "there"]) → ["hello*", "there*"]
    //addStar(["*"]) → ["**"]
    public static void main(String[]args){
        addStar star = new addStar();
        System.out.println(star.addStar(Arrays.asList("a", "bb", "ccc")));
        System.out.println(star.addStar(Arrays.asList("hello", "there")));
        System.out.println(star.addStar(Arrays.asList("*")));
    }

}
