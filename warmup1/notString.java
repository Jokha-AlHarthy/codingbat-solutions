public class notString {
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }else{
            return "not " + str;
        }
    }

    //notString("candy") → "not candy"
    //notString("x") → "not x"
    //notString("not bad") → "not bad"
    public static void main(String[]args){
        notString string = new notString();
        System.out.println(string.notString("candy"));
        System.out.println(string.notString("x"));
        System.out.println(string.notString("not bad"));
    }
}
