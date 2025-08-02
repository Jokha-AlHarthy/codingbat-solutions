public class noX {
    public String noX(String str) {
        if(str.length()==0){
            return "";
        }else if(str.charAt(0)=='x'){
            return noX(str.substring(1));
        }else{
            return str.charAt(0) + noX(str.substring(1));
        }
    }

    //noX("xaxb") → "ab"
    //noX("abc") → "abc"
    //noX("xx") → ""
    public static void main(String[]args){
        noX x = new noX();
        System.out.println(x.noX("xaxb"));
        System.out.println(x.noX("abc"));
        System.out.println(x.noX("xx"));
    }
}
