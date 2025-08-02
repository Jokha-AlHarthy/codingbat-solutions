public class doubleChar {
    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }

    //doubleChar("The") → "TThhee"
    //doubleChar("AAbb") → "AAAAbbbb"
    //doubleChar("Hi-There") → "HHii--TThheerree"
    public static void main(String[]args){
        doubleChar dChar = new doubleChar();
        System.out.println(dChar.doubleChar("The"));
        System.out.println(dChar.doubleChar("AAbb"));
        System.out.println(dChar.doubleChar("Hi-There"));
    }
}
