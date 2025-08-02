import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class moreY {
    public List<String> moreY(List<String> strings) {
        List<String>result = new ArrayList<>();
        for(String str : strings){
            result.add("y"+str+"y");
        }
        return result;
    }

    //moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    //moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
    //moreY(["yay"]) → ["yyayy"]
    public static void main(String[]args){
        moreY more = new moreY();
        System.out.println(more.moreY(Arrays.asList("a", "b", "c")));
        System.out.println(more.moreY(Arrays.asList("hello", "there")));
        System.out.println(more.moreY(Arrays.asList("yay")));
    }
}
