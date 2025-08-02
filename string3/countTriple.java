public class countTriple {
    public int countTriple(String str) {
        int count=0;
        for(int i = 0; i < str.length() - 2; i++){
            char ch = str.charAt(i);
            if(ch == str.charAt(i + 1) && ch == str.charAt(i + 2)){
                count++;
            }
        }
        return count;
    }


    //countTriple("abcXXXabc") → 1
    //countTriple("xxxabyyyycd") → 3
    //countTriple("a") → 0
    public static void main(String[]args){
        countTriple triple = new countTriple();
        System.out.println(triple.countTriple("abcXXXabc"));
        System.out.println(triple.countTriple("xxxabyyyycd"));
        System.out.println(triple.countTriple("a"));
    }
}
