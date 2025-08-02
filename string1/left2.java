public class left2 {
    public String left2(String str) {
        return str.substring(2)+ str.substring(0,2);
    }

    //left2("Hello") → "lloHe"
    //left2("java") → "vaja"
    //left2("Hi") → "Hi"
    public static void main(String[]args){
        left2 left = new left2();
        System.out.println(left.left2("Hello"));
        System.out.println(left.left2("java"));
        System.out.println(left.left2("Hi"));
    }
}
