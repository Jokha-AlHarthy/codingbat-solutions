public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if(count == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; i++){
            result.append(word);
            if(i < count - 1){
                result.append(sep);
            }
        }
        return result.toString();
    }

    //repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    //repeatSeparator("This", "And", 2) → "ThisAndThis"
    //repeatSeparator("This", "And", 1) → "This"
    public static void main(String[]args){
        repeatSeparator separator = new repeatSeparator();
        System.out.println(separator.repeatSeparator("Word", "X", 3));
        System.out.println(separator.repeatSeparator("This", "And", 2));
        System.out.println(separator.repeatSeparator("This", "And", 1));
    }
}
