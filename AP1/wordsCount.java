public class wordsCount {
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for(String word : words){
            if(word.length()==len){
                count++;
            }
        }
        return count;
    }

    //wordsCount(["a", "bb", "b", "ccc"], 1) → 2
    //wordsCount(["a", "bb", "b", "ccc"], 3) → 1
    //wordsCount(["a", "bb", "b", "ccc"], 4) → 0
    public static void main(String[]args){
        wordsCount word = new wordsCount();
        System.out.println(word.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(word.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(word.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
}
