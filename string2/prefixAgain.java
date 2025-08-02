public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }

    //prefixAgain("abXYabc", 1) → true
    //prefixAgain("abXYabc", 2) → true
    //prefixAgain("abXYabc", 3) → false
    public static void main(String[]args){
        prefixAgain again = new prefixAgain();
        System.out.println(again.prefixAgain("abXYabc", 1));
        System.out.println(again.prefixAgain("abXYabc", 2));
        System.out.println(again.prefixAgain("abXYabc", 3));
    }
}
