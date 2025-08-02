public class oneTwo {
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i + 2 < str.length(); i += 3){
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            char third = str.charAt(i + 2);
            result.append(second).append(third).append(first);
        }
        return result.toString();
    }

    //oneTwo("abc") → "bca"
    //oneTwo("tca") → "cat"
    //oneTwo("tcagdo") → "catdog"
    public static void main(String[]args){
        oneTwo two = new oneTwo();
        System.out.println(two.oneTwo("abc"));
        System.out.println(two.oneTwo("tca"));
        System.out.println(two.oneTwo("tcagdo"));
    }
}
