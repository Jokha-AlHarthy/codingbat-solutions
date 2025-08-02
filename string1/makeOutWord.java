public class makeOutWord {
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }

    //makeOutWord("<<>>", "Yay") → "<<Yay>>"
    //makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    //makeOutWord("[[]]", "word") → "[[word]]"
    public static void main(String[]args){
        makeOutWord word = new makeOutWord();
        System.out.println(word.makeOutWord("<<>>", "Yay"));
        System.out.println(word.makeOutWord("<<>>", "WooHoo"));
        System.out.println(word.makeOutWord("<<>>", "word"));
    }
}
