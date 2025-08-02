import java.util.HashMap;
import java.util.Map;

public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            String valueA = map.get("a");
            String valueB = map.get("b");
            map.put("ab", valueA + valueB);
        }
        return map;
    }

    //mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    //mapAB({"a": "Hi"}) → {"a": "Hi"}
    //mapAB({"b": "There"}) → {"b": "There"}
    public static void main(String[]args){
        mapAB mapping = new mapAB();
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println(mapping.mapAB(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        System.out.println(mapping.mapAB(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        System.out.println(mapping.mapAB(map3));
    }
}
