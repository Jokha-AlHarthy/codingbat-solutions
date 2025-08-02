public class mirrorEnds {
    public String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == string.charAt(string.length() - 1 - i)){
                result.append(string.charAt(i));
            }else{
                break;
            }
        }
        return result.toString();
    }

    //mirrorEnds("abXYZba") → "ab"
    //mirrorEnds("abca") → "a"
    //mirrorEnds("aba") → "aba"
    public static void main(String[]args){
        mirrorEnds mirror = new mirrorEnds();
        System.out.println(mirror.mirrorEnds("abXYZba"));
        System.out.println(mirror.mirrorEnds("abca"));
        System.out.println(mirror.mirrorEnds("aba"));
    }
}
