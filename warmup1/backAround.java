public class backAround {
    public String backAround(String str) {
        String lastChar = str.substring(str.length()-1);
        return lastChar + str + lastChar;
    }

    //backAround("cat") → "tcatt"
    //backAround("Hello") → "oHelloo"
    //backAround("a") → "aaa"
    public static void main(String[]args){
        backAround back = new backAround();
        System.out.println(back.backAround("cat"));
        System.out.println(back.backAround("Hello"));
        System.out.println(back.backAround("a"));
    }
}
