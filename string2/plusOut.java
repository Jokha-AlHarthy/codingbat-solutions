public class plusOut {
    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            if(i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)){
                result.append(word);
                i += word.length();
            }else{
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }


    //plusOut("12xy34", "xy") → "++xy++"
    //plusOut("12xy34", "1") → "1+++++"
    //plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    public static void main(String[]args){
        plusOut out = new plusOut();
        System.out.println(out.plusOut("12xy34", "xy"));
        System.out.println(out.plusOut("12xy34", "1"));
        System.out.println(out.plusOut("12xy34xyabcxy", "xy"));
    }
}
