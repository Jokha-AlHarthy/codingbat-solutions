import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        List<String>result = new ArrayList<>();
        for(String str : strings){
            result.add(str+str+str);
        }
        return result;
    }

    //copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    //copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    //copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
    public static void main(String[]args){
        copies3 copy = new copies3();
        System.out.println(copy.copies3(Arrays.asList("a", "bb", "ccc")));
        System.out.println(copy.copies3(Arrays.asList("24", "a", "")));
        System.out.println(copy.copies3(Arrays.asList("hello", "there")));
    }

}
