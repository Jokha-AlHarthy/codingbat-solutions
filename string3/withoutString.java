public class withoutString {
    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + java.util.regex.Pattern.quote(remove), "");
    }

    //withoutString("Hello there", "llo") → "He there"
    //withoutString("Hello there", "e") → "Hllo thr"
    //withoutString("Hello there", "x") → "Hello there"
    public static void main(String[]args){
        withoutString without = new withoutString();
        System.out.println(without.withoutString("Hello there","llo"));
        System.out.println(without.withoutString("Hello there","e"));
        System.out.println(without.withoutString("Hello there","x"));
    }
}
