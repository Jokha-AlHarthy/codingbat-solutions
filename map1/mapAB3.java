import java.util.HashMap;
import java.util.Map;

public class mapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        boolean hasA = map.containsKey("a");
        boolean hasB = map.containsKey("b");
        if(hasA && !hasB){
            map.put("b", map.get("a"));
        }else if(!hasA && hasB){
            map.put("a", map.get("b"));
        }
        return map;
    }

    //mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
    //mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
    //mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
    public static void main(String[]args){
        mapAB3 mapping = new mapAB3();
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("c", "cake");
        System.out.println(mapping.mapAB3(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "bbb");
        map2.put("c", "cake");
        System.out.println(mapping.mapAB3(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");
        System.out.println(mapping.mapAB3(map3));
    }
}
