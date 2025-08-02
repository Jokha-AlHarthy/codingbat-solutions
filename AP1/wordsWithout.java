import java.util.Arrays;

public class wordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for(String word : words){
            if(!word.equals(target)){
                count++;
            }
        }

        String[]result = new String[count];
        int index = 0;
        for(String word : words){
            if(!word.equals(target)){
                result[index]=word;
                index++;
            }
        }

        return result;
    }

    //wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
    //wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
    //wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
    public static void main(String[]args){
        wordsWithout word = new wordsWithout();
        System.out.println(Arrays.toString(word.wordsWithout(new String[]{"a", "b", "c", "a"}, "a")));
        System.out.println(Arrays.toString(word.wordsWithout(new String[]{"a", "b", "c", "a"}, "b")));
        System.out.println(Arrays.toString(word.wordsWithout(new String[]{"a", "b", "c", "a"}, "c")));
    }
}
