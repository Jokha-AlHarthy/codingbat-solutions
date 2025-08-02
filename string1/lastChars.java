public class lastChars {
    public String lastChars(String a, String b) {
        char first = (a.length() > 0) ? a.charAt(0) : '@';
        char last = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
        return "" + first + last;
    }

    //lastChars("last", "chars") → "ls"
    //lastChars("yo", "java") → "ya"
    //lastChars("hi", "") → "h@"
    public static void main(String[]args){
        lastChars last = new lastChars();
        System.out.println(last.lastChars("last", "chars"));
        System.out.println(last.lastChars("yo", "java"));
        System.out.println(last.lastChars("hi", ""));
    }
}
