public class pairStar {
    public String pairStar(String str) {
        if(str.length() <= 1){
            return str;
        }else if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+ "*"+ pairStar(str.substring(1));
        }else{
            return str.charAt(0) +pairStar(str.substring(1));
        }
    }

    //pairStar("hello") → "hel*lo"
    //pairStar("xxyy") → "x*xy*y"
    //pairStar("aaaa") → "a*a*a*a"
    public static void main(String[]args){
        pairStar star = new pairStar();
        System.out.println(star.pairStar("hello"));
        System.out.println(star.pairStar("xxyy"));
        System.out.println(star.pairStar("aaaa"));
    }
}
