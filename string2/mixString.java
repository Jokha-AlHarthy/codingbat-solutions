public class mixString {
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        for(int i = 0; i < minLength; i++){
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        if(a.length() > minLength){
            result.append(a.substring(minLength));
        }else if(b.length() > minLength){
            result.append(b.substring(minLength));
        }
        return result.toString();
    }

    //mixString("abc", "xyz") → "axbycz"
    //mixString("Hi", "There") → "HTihere"
    //mixString("xxxx", "There") → "xTxhxexre"
    public static void main(String[]args){
        mixString mix = new mixString();
        System.out.println(mix.mixString("abc","xyz"));
        System.out.println(mix.mixString("Hi", "There"));
        System.out.println(mix.mixString("xxxx", "There"));
    }
}
