import java.util.HashMap;
import java.util.Map;

public class pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str : strings){
            String key = str.substring(0, 1);
            String value = str.substring(str.length() - 1);
            map.put(key, value);
        }
        return map;
    }

    //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    //pairs(["man", "moon", "main"]) → {"m": "n"}
    //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
    public static void main(String[]args){
        pairs pair = new pairs();
        System.out.println(pair.pairs(new String[]{"code", "bug"}));
        System.out.println(pair.pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pair.pairs(new String[]{"man", "moon", "good", "night"}));
    }
}
