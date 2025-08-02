import java.util.HashMap;
import java.util.Map;

public class mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a") && map.get("a") != null){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    //mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    //mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    //mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
    public static void main(String[]args){
        mapShare mapping = new mapShare();
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println(mapping.mapShare(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        System.out.println(mapping.mapShare(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        System.out.println(mapping.mapShare(map3));
    }
}
