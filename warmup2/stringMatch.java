public class stringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int minLen = Math.min(a.length(), b.length());
        for(int i = 0; i < minLen - 1; i++){
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            if(subA.equals(subB)){
                count++;
            }
        }
        return count;
    }


    //stringMatch("xxcaazz", "xxbaaz") → 3
    //stringMatch("abc", "abc") → 2
    //stringMatch("abc", "axc") → 0
    public static void main(String[]args){
        stringMatch match = new stringMatch();
        System.out.println(match.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(match.stringMatch("abc", "abc"));
        System.out.println(match.stringMatch("abc", "axc"));
    }
}
