import java.util.ArrayList;
import java.util.List;

public class wordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }


    //wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
//wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
//wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
    public static void main(String[] args) {
        wordsWithoutList word = new wordsWithoutList();
        System.out.println(word.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(word.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(word.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
}
