public class stringBits {
    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i += 2){
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    //stringBits("Hello") → "Hlo"
    //stringBits("Hi") → "H"
    //stringBits("Heeololeo") → "Hello"
    public static void main(String[]args){
        stringBits bits = new stringBits();
        System.out.println(bits.stringBits("Hello"));
        System.out.println(bits.stringBits("Hi"));
        System.out.println(bits.stringBits("Heeololeo"));
    }
}
