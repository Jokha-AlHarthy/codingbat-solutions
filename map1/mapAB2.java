import java.util.HashMap;
import java.util.Map;

public class mapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }


    //mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    //mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
    //mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
    public static void main(String[]args){
        mapAB2 mapping = new mapAB2();
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");
        System.out.println(mapping.mapAB2(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");
        System.out.println(mapping.mapAB2(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "aaa");
        System.out.println(mapping.mapAB2(map3));
    }

}
