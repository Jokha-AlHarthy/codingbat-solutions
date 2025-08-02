public class countAbc {
    public int countAbc(String str) {
        if(str.length() < 3) {
            return 0;
        }else if(str.startsWith("abc") || str.startsWith("aba")){
            return 1 + countAbc(str.substring(1));
        }else{
            return countAbc(str.substring(1));
        }
    }

    //countAbc("abc") → 1
    //countAbc("abcxxabc") → 2
    //countAbc("abaxxaba") → 2
    public static void main(String[]args){
        countAbc abc = new countAbc();
        System.out.println(abc.countAbc("abc"));
        System.out.println(abc.countAbc("abcxxabc"));
        System.out.println(abc.countAbc("abaxxaba"));
    }
}
