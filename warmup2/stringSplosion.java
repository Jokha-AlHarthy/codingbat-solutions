public class stringSplosion {
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= str.length(); i++){
            result.append(str.substring(0, i));
        }
        return result.toString();
    }

    //stringSplosion("Code") → "CCoCodCode"
    //stringSplosion("abc") → "aababc"
    //stringSplosion("ab") → "aab"
    public static void main(String[]args){
        stringSplosion splosion = new stringSplosion();
        System.out.println(splosion.stringSplosion("Code"));
        System.out.println(splosion.stringSplosion("abc"));
        System.out.println(splosion.stringSplosion("ab"));
    }
}
