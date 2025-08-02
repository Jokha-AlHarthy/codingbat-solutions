public class middleThree {
    public String middleThree(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }

    //middleThree("Candy") → "and"
    //middleThree("and") → "and"
    //middleThree("solving") → "lvi"
    public static void main(String[]args){
        middleThree mid = new middleThree();
        System.out.println(mid.middleThree("Candy"));
        System.out.println(mid.middleThree("and"));
        System.out.println(mid.middleThree("solving"));
    }
}
