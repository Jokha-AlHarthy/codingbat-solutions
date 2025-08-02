import java.util.HashMap;
import java.util.Map;

public class topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }

    //topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
    //topping1({}) → {"bread": "butter"}
    //topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
    public static void main(String[]args){
        topping1 mapping = new topping1();
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        System.out.println(mapping.topping1(map1));

        Map<String, String> map2 = new HashMap<>();
        System.out.println(mapping.topping1(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("pancake", "syrup");
        System.out.println(mapping.topping1(map3));
    }

}
