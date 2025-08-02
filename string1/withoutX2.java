public class withoutX2 {
    public String withoutX2(String str) {
        String result = "";
        if(str.length() >= 1 && str.charAt(0) != 'x'){
            result += str.charAt(0);
        }if(str.length() >= 2 && str.charAt(1) != 'x'){
            result += str.charAt(1);
        }if(str.length() > 2){
            result += str.substring(2);
        }
        return result;
    }

    //withoutX2("xHi") → "Hi"
    //withoutX2("Hxi") → "Hi"
    //withoutX2("Hi") → "Hi"
    public static void main(String[]args){
        withoutX2 x = new withoutX2();
        System.out.println(x.withoutX2("xHi"));
        System.out.println(x.withoutX2("Hxi"));
        System.out.println(x.withoutX2("Hi"));
    }
}
