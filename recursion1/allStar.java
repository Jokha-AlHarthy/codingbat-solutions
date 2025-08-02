public class allStar {
    public String allStar(String str) {
        if(str.length() <= 1){
            return str;
        }else{
            return str.charAt(0) + "*" + allStar(str.substring(1));
        }
    }

    //allStar("hello") → "h*e*l*l*o"
    //allStar("abc") → "a*b*c"
    //allStar("ab") → "a*b"
    public static void main(String[]args){
        allStar star = new allStar();
        System.out.println(star.allStar("hello"));
        System.out.println(star.allStar("abc"));
        System.out.println(star.allStar("ab"));
    }
}
