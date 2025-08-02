public class without2 {
    public String without2(String str) {
        if(str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return str.substring(2);
        }else{
            return str;
        }
    }

    //without2("HelloHe") → "lloHe"
    //without2("HelloHi") → "HelloHi"
    //without2("Hi") → ""
    public static void main(String[]args){
        without2 without = new without2();
        System.out.println(without.without2("HelloHe"));
        System.out.println(without.without2("HelloHi"));
        System.out.println(without.without2("Hi"));
    }
}
