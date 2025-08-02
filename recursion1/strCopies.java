public class strCopies {
    public boolean strCopies(String str, String sub, int n) {
        int len = sub.length();
        if(n==0){
            return true;
        }else if(str.length() < len){
            return false;
        }else if(str.substring(0, len).equals(sub)){
            return strCopies(str.substring(1), sub, n - 1);
        }else{
            return strCopies(str.substring(1), sub, n);
        }
    }

    //strCopies("catcowcat", "cat", 2) → true
    //strCopies("catcowcat", "cow", 2) → false
    //strCopies("catcowcat", "cow", 1) → true
    public static void main(String[]args){
        strCopies copy = new strCopies();
        System.out.println(copy.strCopies("catcowcat", "cat", 2));
        System.out.println(copy.strCopies("catcowcat", "cow", 2));
        System.out.println(copy.strCopies("catcowcat", "cow", 1));
    }
}
