public class firstHalf {
    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }

    //firstHalf("WooHoo") → "Woo"
    //firstHalf("HelloThere") → "Hello"
    //firstHalf("abcdef") → "abc"
    public static void main(String[]args){
        firstHalf half = new firstHalf();
        System.out.println(half.firstHalf("WooHoo"));
        System.out.println(half.firstHalf("HelloThere"));
        System.out.println(half.firstHalf("abcdef"));

    }
}
