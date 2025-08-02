public class strCount {
    public int strCount(String str, String sub) {
        int len = sub.length();
        if(str.length() < len){
            return 0;
        }else if(str.substring(0, len).equals(sub)){
            return 1 + strCount(str.substring(len), sub);
        }else{
            return strCount(str.substring(1), sub);
        }
    }

    //strCount("catcowcat", "cat") → 2
    //strCount("catcowcat", "cow") → 1
    //strCount("catcowcat", "dog") → 0
    public static void main(String[]args){
        strCount count = new strCount();
        System.out.println(count.strCount("catcowcat", "cat"));
        System.out.println(count.strCount("catcowcat", "cow"));
        System.out.println(count.strCount("catcowcat", "dog"));
    }
}
