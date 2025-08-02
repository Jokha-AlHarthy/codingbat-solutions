import java.util.HashMap;
import java.util.Map;

public class topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }if(map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    //topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
    //topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
    //topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
    public static void main(String[]args){
        topping3 mapping = new topping3();
        Map<String, String> map1 = new HashMap<>();
        map1.put("potato", "ketchup");
        System.out.println(mapping.topping3(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("potato", "butter");
        System.out.println(mapping.topping3(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("salad", "oil");
        map3.put("potato", "ketchup");
        System.out.println(mapping.topping3(map3));
    }

}
