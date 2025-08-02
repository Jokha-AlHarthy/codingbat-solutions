public class sameStarChar {
    public boolean sameStarChar(String str) {
        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) == '*'){
                if(str.charAt(i - 1) != str.charAt(i + 1)){
                    return false;
                }
            }
        }
        return true;
    }

    //sameStarChar("xy*yzz") → true
    //sameStarChar("xy*zzz") → false
    //sameStarChar("*xa*az") → true
    public static void main(String[]args){
        sameStarChar star = new sameStarChar();
        System.out.println(star.sameStarChar("xy*yzz"));
        System.out.println(star.sameStarChar("xy*zzz"));
        System.out.println(star.sameStarChar("*xa*az"));
    }
}
