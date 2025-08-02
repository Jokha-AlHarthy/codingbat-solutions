import java.util.ArrayList;
import java.util.List;

public class noZ {
    public List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String str : strings){
            if(!str.contains("z")){
                result.add(str);
            }
        }
        return result;
    }

    //noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    //noZ(["hziz", "hzello", "hi"]) → ["hi"]
    //noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
    public static void main(String[]args){
        noZ z = new noZ();
        System.out.println(z.noZ(List.of("aaa", "bbb", "aza")));
        System.out.println(z.noZ(List.of("hziz", "hzello", "hi")));
        System.out.println(z.noZ(List.of("hello", "howz", "are", "youz")));
    }
}
