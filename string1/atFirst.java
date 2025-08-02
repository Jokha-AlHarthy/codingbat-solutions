public class atFirst {
    public String atFirst(String str) {
        if(str.length() >= 2){
            return str.substring(0,2);
        }else if (str.length() == 1){
            return str + "@";
        }else{
            return "@@";
        }
    }

    //atFirst("hello") → "he"
    //atFirst("hi") → "hi"
    //atFirst("h") → "h@"
    public static void main(String[]args){
        atFirst first = new atFirst();
        System.out.println(first.atFirst("hello"));
        System.out.println(first.atFirst("hi"));
        System.out.println(first.atFirst("h"));
    }
}
