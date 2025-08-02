import java.util.ArrayList;
import java.util.List;

public class no34 {
    public List<String> no34(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String str : strings){
            int len = str.length();
            if(len !=3 && len != 4){
                result.add(str);
            }
        }
        return result;
    }

    //no34(["a", "bb", "ccc"]) → ["a", "bb"]
    //no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
    //no34(["ccc", "dddd", "apple"]) → ["apple"]
    public static void main(String[]args){
        no34 latter = new no34();
        System.out.println(latter.no34(List.of("a", "bb", "ccc")));
        System.out.println(latter.no34(List.of("a", "bb", "ccc", "dddd")));
        System.out.println(latter.no34(List.of("ccc", "dddd", "apple")));
    }
}
