public class startWord {
    public String startWord(String str, String word) {
        if(str.length() < word.length()){
            return "";
        }else if(str.substring(1, word.length()).equals(word.substring(1))){
            return str.substring(0,word.length());
        }else{
            return "";
        }
    }

    //startWord("hippo", "hi") → "hi"
    //startWord("hippo", "xip") → "hip"
    //startWord("hippo", "i") → "h"
    public static void main(String[]args){
        startWord word = new startWord();
        System.out.println(word.startWord("hippo", "hi"));
        System.out.println(word.startWord("hippo", "xip"));
        System.out.println(word.startWord("hippo", "i"));
    }
}
