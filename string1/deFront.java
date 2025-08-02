public class deFront {
    public String deFront(String str) {
        String result = "";
        if(str.length() >= 1 && str.charAt(0) == 'a'){
            result += 'a';
        }if(str.length() >= 2 && str.charAt(1) == 'b'){
            result += 'b';
        }if(str.length() > 2){
            result += str.substring(2);
        }
        return result;
    }

    //deFront("Hello") → "llo"
    //deFront("java") → "va"
    //deFront("away") → "aay"
    public static void main(String[]args){
        deFront front = new deFront();
        System.out.println(front.deFront("Hello"));
        System.out.println(front.deFront("java"));
        System.out.println(front.deFront("away"));
    }
}
