public class repeatEnd {
    public String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            result.append(end);
        }
        return result.toString();
    }


    //repeatEnd("Hello", 3) → "llollollo"
    //repeatEnd("Hello", 2) → "lolo"
    //repeatEnd("Hello", 1) → "o"
    public static void main(String[]args){
        repeatEnd end = new repeatEnd();
        System.out.println(end.repeatEnd("Hello", 3));
        System.out.println(end.repeatEnd("Hello", 2));
        System.out.println(end.repeatEnd("Hello", 1));
    }
}
