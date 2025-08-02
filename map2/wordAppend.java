import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(String str : strings){
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            if(countMap.get(str) % 2 == 0){
                result.append(str);
            }
        }
        return result.toString();
    }

    //wordAppend(["a", "b", "a"]) → "a"
    //wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
    //wordAppend(["a", "", "a"]) → "a"
    public static void main(String[]args){
        wordAppend word = new wordAppend();
        System.out.println(word.wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(word.wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(word.wordAppend(new String[]{"a", "", "a"}));
    }
}
