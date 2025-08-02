public class endUp {
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int latter = str.length() - 3;
        String frist = str.substring(0, latter);
        String last  = str.substring(latter);  // this takes from cut to the end
        return frist + last.toUpperCase();
    }

    //endUp("Hello") → "HeLLO"
    //endUp("hi there") → "hi thERE"
    //endUp("hi") → "HI"
    public static void main(String[]args){
        endUp string = new endUp();
        System.out.println(string.endUp("Hello"));
        System.out.println(string.endUp("hi there"));
        System.out.println(string.endUp("hi"));
    }
}
