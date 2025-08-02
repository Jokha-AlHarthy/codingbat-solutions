public class everyNth {
    public String everyNth(String str, int n) {
        String result = "";
        for(int i = 0; i < str.length(); i=i+n){
            result = result + str.charAt(i);
        }
        return result;
    }

    //everyNth("Miracle", 2) → "Mrce"
    //everyNth("abcdefg", 2) → "aceg"
    //everyNth("abcdefg", 3) → "adg"
    public static void main(String[]args){
        everyNth every = new everyNth();
        System.out.println(every.everyNth("Miracle", 2));
        System.out.println(every.everyNth("abcdefg", 2));
        System.out.println(every.everyNth("abcdefg", 3));

    }

}
