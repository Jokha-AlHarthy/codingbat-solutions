import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : strings){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            }else{
                map.put(str, 1);
            }
        }
        return map;
    }

    //wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    //wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
    //wordCount(["c", "c", "c", "c"]) → {"c": 4}
    public static void main(String[]args){
        wordCount word = new wordCount();
        System.out.println(word.wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word.wordCount(new String[]{"c", "b", "a"}));
        System.out.println(word.wordCount(new String[]{"c", "c", "c", "c"}));
    }
}
