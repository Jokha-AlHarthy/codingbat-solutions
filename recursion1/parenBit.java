public class parenBit {
    public String parenBit(String str) {
        if(str.length() == 0){
            return "";
        }else if(str.charAt(0) == '('){
            int closeIndex = str.indexOf(')');
            return str.substring(0, closeIndex + 1);
        }else{
            return parenBit(str.substring(1));
        }
    }

    //parenBit("xyz(abc)123") → "(abc)"
    //parenBit("x(hello)") → "(hello)"
    //parenBit("(xy)1") → "(xy)"
    public static void main(String[]args){
        parenBit bit = new parenBit();
        System.out.println(bit.parenBit("xyz(abc)123"));
        System.out.println(bit.parenBit("x(hello)"));
        System.out.println(bit.parenBit("(xy)1"));
    }
}
