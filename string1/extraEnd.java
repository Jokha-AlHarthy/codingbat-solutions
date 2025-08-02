public class extraEnd {
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

    //extraEnd("Hello") → "lololo"
    //extraEnd("ab") → "ababab"
    //extraEnd("Hi") → "HiHiHi"
    public static void main(String[]args){
        extraEnd end = new extraEnd();
        System.out.println(end.extraEnd("Hello"));
        System.out.println(end.extraEnd("ab"));
        System.out.println(end.extraEnd("Hi"));
    }
}
