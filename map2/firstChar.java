import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str : strings){
            String key = str.substring(0, 1);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + str);
            }else{
                map.put(key, str);
            }
        }
        return map;
    }

    //firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    //firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    //firstChar([]) → {}
    public static void main(String[]args){
        firstChar first = new firstChar();
        System.out.println(first.firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(first.firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(first.firstChar(new String[]{}));
    }
}
