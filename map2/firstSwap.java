import java.util.*;

public class firstSwap {
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> swapped = new HashSet<>();
        for(int i = 0; i < strings.length; i++){
            char key = strings[i].charAt(0);
            if(swapped.contains(key)){
                continue;
            }else if(map.containsKey(key)){
                int prevIndex = map.get(key);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                swapped.add(key);
                map.remove(key);
            }else{
                map.put(key, i);
            }
        }
        return strings;
    }


    //firstSwap(["ab", "ac"]) → ["ac", "ab"]
    //firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
    //firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
    public static void main(String[]args){
        firstSwap swap = new firstSwap();
        System.out.println(Arrays.toString(swap.firstSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(swap.firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(swap.firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }
}
