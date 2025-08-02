public class wordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLen = word.length();
        for(int i = 0; i <= str.length() - wordLen; i++){
            if(str.substring(i, i + wordLen).equals(word)){
                if(i > 0){
                    result.append(str.charAt(i - 1));
                }
                if(i + wordLen < str.length()){
                    result.append(str.charAt(i + wordLen));
                }
            }
        }
        return result.toString();
    }

    //wordEnds("abcXY123XYijk", "XY") → "c13i"
    //wordEnds("XY123XY", "XY") → "13"
    //wordEnds("XY1XY", "XY") → "11"
    public static void main(String[]args){
        wordEnds ends = new wordEnds();
        System.out.println(ends.wordEnds("abcXY123XYijk", "XY"));
        System.out.println(ends.wordEnds("XY123XY", "XY"));
        System.out.println(ends.wordEnds("XY1XY", "XY"));
    }
}
