import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();
        for(String str : strings){
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        for(String key : countMap.keySet()){
            result.put(key, countMap.get(key) >= 2);
        }
        return result;
    }

    //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    //wordMultiple(["c", "c", "c", "c"]) → {"c": true}
    public static void main(String[]args){
        wordMultiple word = new wordMultiple();
        System.out.println(word.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word.wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(word.wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
