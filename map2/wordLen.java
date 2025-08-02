import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : strings){
            map.put(str, str.length());
        }
        return map;
    }

    //wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    //wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
    //wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
    public static void main(String[]args){
        wordLen word = new wordLen();
        System.out.println(word.wordLen(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(word.wordLen(new String[]{"this", "and", "that", "and"}));
        System.out.println(word.wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}
