public class stringClean {
    public String stringClean(String str) {
        if(str.length() <= 1){
            return str;
        }else if(str.charAt(0) == str.charAt(1)){
            return stringClean(str.substring(1));
        }else{
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    //stringClean("yyzzza") → "yza"
    //stringClean("abbbcdd") → "abcd"
    //stringClean("Hello") → "Helo"
    public static void main(String[]args){
        stringClean clean = new stringClean();
        System.out.println(clean.stringClean("yyzzza"));
        System.out.println(clean.stringClean("abbbcdd"));
        System.out.println(clean.stringClean("Hello"));
    }
}
