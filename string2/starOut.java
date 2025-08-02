public class starOut {
    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            boolean isStar = str.charAt(i) == '*';
            boolean prevIsStar = i > 0 && str.charAt(i - 1) == '*';
            boolean nextIsStar = i < str.length() - 1 && str.charAt(i + 1) == '*';
            if(!isStar && !prevIsStar && !nextIsStar){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    //starOut("ab*cd") → "ad"
    //starOut("ab**cd") → "ad"
    //starOut("sm*eilly") → "silly"
    public static void main(String[]args){
        starOut out = new starOut();
        System.out.println(out.starOut("ab*cd"));
        System.out.println(out.starOut("ab**cd"));
        System.out.println(out.starOut("sm*eilly"));
    }
}
