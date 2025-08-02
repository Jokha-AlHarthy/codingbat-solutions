public class stringX {
    public String stringX(String str) {
        if(str.length() <= 2){
            return str;
        }
        String middle = str.substring(1, str.length() - 1);
        middle = middle.replace("x", "");
        return str.charAt(0) + middle + str.charAt(str.length() - 1);
    }


    //stringX("xxHxix") → "xHix"
    //stringX("abxxxcd") → "abcd"
    //stringX("xabxxxcdx") → "xabcdx"
    public static void main(String[]args){
        stringX x = new stringX();
        System.out.println(x.stringX("xxHxix"));
        System.out.println(x.stringX("abxxxcd"));
        System.out.println(x.stringX("xabxxxcdx"));
    }
}
