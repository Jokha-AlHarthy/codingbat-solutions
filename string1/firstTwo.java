public class firstTwo {
    public String firstTwo(String str) {
        if(str.length() < 2){
            return str;
        }else{
            return str.substring(0,2);
        }
    }

    //firstTwo("Hello") → "He"
    //firstTwo("abcdefg") → "ab"
    //firstTwo("ab") → "ab"
    public static void main(String []args){
        firstTwo two = new firstTwo();
        System.out.println(two.firstTwo("Hello"));
        System.out.println(two.firstTwo("abcdefg"));
        System.out.println(two.firstTwo("ab"));

    }
}
