import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            String current = strings[i];
            char key = current.charAt(0);
            if(map.containsKey(key)){
                int prevIndex = map.get(key);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                map.remove(key);
            }else{
                map.put(key, i);
            }
        }
        return strings;
    }

    //allSwap(["ab", "ac"]) → ["ac", "ab"]
    //allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
    //allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
    public static void main(String[]args){
        allSwap swap = new allSwap();
        System.out.println(Arrays.toString(swap.allSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(swap.allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(swap.allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }

}
