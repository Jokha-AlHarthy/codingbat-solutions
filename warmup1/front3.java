public class front3 {
    public String front3(String str) {
        String first;
        if(str.length()>=3){
            first = str.substring(0,3);
        }else{
            first = str;
        }
        return first+first+first;
    }

    //front3("Java") → "JavJavJav"
    //front3("Chocolate") → "ChoChoCho"
    //front3("abc") → "abcabcabc"
    public static void main(String[]args){
        front3 string = new front3();
        System.out.println(string.front3("Java"));
        System.out.println(string.front3("Chocolate"));
        System.out.println(string.front3("abc"));
    }
}
