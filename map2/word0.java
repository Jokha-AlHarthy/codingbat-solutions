import java.util.HashMap;
import java.util.Map;

public class word0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            map.put(s, 0);
        }
        return map;
    }

    //word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
    //word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
    //word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
    public static void main(String[]args){
        word0 word = new word0();
        System.out.println(word.word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(word.word0(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word.word0(new String[]{"c", "b", "a"}));
    }


}
