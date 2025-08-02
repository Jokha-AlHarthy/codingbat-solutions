import java.util.Arrays;

public class wordsFront {
    public String[] wordsFront(String[] words, int n) {
        String[]result = new String[n];
        for (int i = 0; i < n; i++){
            result[i] = words[i];
        }
        return result;
    }

    //wordsFront(["a", "b", "c", "d"], 1) → ["a"]
    //wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
    //wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
    public static void main(String[]args){
        wordsFront word = new wordsFront();
        System.out.println(Arrays.toString(word.wordsFront(new String[]{"a", "b", "c", "d"},1)));
        System.out.println(Arrays.toString(word.wordsFront(new String[]{"a", "b", "c", "d"},2)));
        System.out.println(Arrays.toString(word.wordsFront(new String[]{"a", "b", "c", "d"},3)));
    }
}
