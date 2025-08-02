import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class noX {
    public List<String> noX(List<String> strings) {
        List<String> result= new ArrayList<>();
        for(String str : strings){
            result.add(str.replace("x",""));
        }
        return result;
    }

    //noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    //noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    //noX(["x"]) → [""]
    public static void main(String[]args){
        noX x = new noX();
        System.out.println(x.noX(Arrays.asList("ax", "bb", "cx")));
        System.out.println(x.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
        System.out.println(x.noX(Arrays.asList("x")));
    }
}
