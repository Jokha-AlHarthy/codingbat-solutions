import java.util.Arrays;

public class matchUp {
    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for(int i = 0; i <a.length; i++){
            if(!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)){
                count++;
            }
        }
        return count;
    }

    //matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
    //matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
    //matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
    public static void main(String[]args){
        matchUp match = new matchUp();
        System.out.println(match.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        System.out.println(match.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        System.out.println(match.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
    }
}
