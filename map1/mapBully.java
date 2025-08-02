import java.util.HashMap;
import java.util.Map;

public class mapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a") && map.get("a") != null){
            map.put("b", map.get("a"));
            map.put("a","");
        }
        return map;
    }

    //mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
    //mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
    //mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
    public static void main(String[]args){
        mapBully mapping = new mapBully();
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        System.out.println(mapping.mapBully(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");
        System.out.println(mapping.mapBully(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "dirt");
        map3.put("c", "meh");
        System.out.println(mapping.mapBully(map3));
    }
}
