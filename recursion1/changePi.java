public class changePi {
    public String changePi(String str) {
        if(str.length()<2){
            return str;
        }else if(str.substring(0,2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        }else{
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

    //changePi("xpix") → "x3.14x"
    //changePi("pipi") → "3.143.14"
    //changePi("pip") → "3.14p"
    public static void main(String[]args){
        changePi pi = new changePi();
        System.out.println(pi.changePi("xpix"));
        System.out.println(pi.changePi("pipi"));
        System.out.println(pi.changePi("pip"));
    }
}
