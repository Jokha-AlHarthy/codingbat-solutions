public class comboString {
    public String comboString(String a, String b) {
        if(a.length() < b.length()){
            return a + b + a;
        }else{
            return b + a + b;
        }
    }

    //comboString("Hello", "hi") → "hiHellohi"
    //comboString("hi", "Hello") → "hiHellohi"
    //comboString("aaa", "b") → "baaab"
    public static void main(String[]args){
        comboString combo = new comboString();
        System.out.println(combo.comboString("Hello", "hi"));
        System.out.println(combo.comboString("hi", "Hello"));
        System.out.println(combo.comboString("aaa", "b"));
    }

}
