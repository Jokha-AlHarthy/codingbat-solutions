public class sameEnds {
    public String sameEnds(String string) {
        int len = string.length();
        String result = "";
        for(int i = 0; i < len / 2; i++){
            String start = string.substring(0, i + 1);
            String end = string.substring(len - i - 1);
            if(start.equals(end)){
                result = start;
            }
        }
        return result;
    }

    //sameEnds("abXYab") → "ab"
    //sameEnds("xx") → "x"
    //sameEnds("xxx") → "x"
    public static void main(String[]args){
        sameEnds ends = new sameEnds();
        System.out.println(ends.sameEnds("abXYab"));
        System.out.println(ends.sameEnds("xx"));
        System.out.println(ends.sameEnds("xxx"));
    }
}
