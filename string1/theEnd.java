public class theEnd {
    public String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }else{
            return str.substring(str.length()-1);
        }
    }

    //theEnd("Hello", true) → "H"
    //theEnd("Hello", false) → "o"
    //theEnd("oh", true) → "o"
    public static void main(String[]args){
        theEnd end = new theEnd();
        System.out.println(end.theEnd("Hello", true));
        System.out.println(end.theEnd("Hello", false));
        System.out.println(end.theEnd("oh", true));
    }

}
