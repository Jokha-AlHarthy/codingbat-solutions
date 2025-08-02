public class right2 {
    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }

    //right2("Hello") → "loHel"
    //right2("java") → "vaja"
    //right2("Hi") → "Hi"
    public static void main(String[]args){
        right2 right = new right2();
        System.out.println(right.right2("Hello"));
        System.out.println(right.right2("java"));
        System.out.println(right.right2("Hi"));
    }
}
