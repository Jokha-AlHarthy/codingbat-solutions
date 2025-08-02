import java.util.HashMap;
import java.util.Map;

public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            String valueA = map.get("a");
            String valueB = map.get("b");
            if(valueA.length() > valueB.length()){
                map.put("c", valueA);
            }else if(valueB.length() > valueA.length()){
                map.put("c", valueB);
            }else{
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    //mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
    //mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
    //mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
    public static void main(String[]args){
        mapAB4 mapping = new mapAB4();
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        map1.put("c", "cake");
        System.out.println(mapping.mapAB4(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        map2.put("c", "cake");
        System.out.println(mapping.mapAB4(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bbb");
        map3.put("c", "cake");
        System.out.println(mapping.mapAB4(map3));
    }
}
