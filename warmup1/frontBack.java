public class frontBack {
    public String frontBack(String str) {
        int len = str.length();

        if(len<=1){
            return str;
        }else{
            return str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0);
        }
    }

    //frontBack("code") → "eodc"
    //frontBack("a") → "a"
    //frontBack("ab") → "ba"
    public static void main(String[]args){
        frontBack string = new frontBack();
        System.out.println(string.frontBack("code"));
        System.out.println(string.frontBack("a"));
        System.out.println(string.frontBack("ab"));
    }

}
