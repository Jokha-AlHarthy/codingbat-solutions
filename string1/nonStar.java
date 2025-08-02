public class nonStar {
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    //nonStart("Hello", "There") → "ellohere"
    //nonStart("java", "code") → "avaode"
    //nonStart("shotl", "java") → "hotlava"
    public static void main(String[]args){
        nonStar non = new nonStar();
        System.out.println(non.nonStart("Hello", "There"));
        System.out.println(non.nonStart("java", "code"));
        System.out.println(non.nonStart("shotl", "java"));
    }
}
