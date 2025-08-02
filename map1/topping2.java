import java.util.HashMap;
import java.util.Map;

public class topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }if(map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        return map;
    }

    //topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
    //topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
    //topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
    public static void main(String[]args){
        topping2 mapping = new topping2();
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        System.out.println(mapping.topping2(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("spinach", "dirt");
        map2.put("ice cream", "cherry");
        System.out.println(mapping.topping2(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "salt");
        System.out.println(mapping.topping2(map3));
    }

}
