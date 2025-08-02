public class middleTwo {
    public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }

    //middleTwo("string") → "ri"
    //middleTwo("code") → "od"
    //middleTwo("Practice") → "ct"
    public static void main(String[]args){
        middleTwo two = new middleTwo();
        System.out.println(two.middleTwo("string"));
        System.out.println(two.middleTwo("code"));
        System.out.println(two.middleTwo("Practice"));
    }
}
