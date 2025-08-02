import java.util.ArrayList;
import java.util.List;

public class noYY {
    public List<String> noYY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String str : strings){
            String withY = str + "y";
            if(!withY.contains("yy")){
                result.add(withY);
            }
        }
        return result;
    }

    //noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    //noYY(["a", "b", "cy"]) → ["ay", "by"]
    //noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
    public static void main(String[]args){
        noYY latter = new noYY();
        System.out.println(latter.noYY(List.of("a", "b", "c")));
        System.out.println(latter.noYY(List.of("a", "b", "cy")));
        System.out.println(latter.noYY(List.of("xx", "ya", "zz")));
    }

}
