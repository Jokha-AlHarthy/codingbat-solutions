public class startHi {
    public boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }else{
            return false;
        }
    }

    //startHi("hi there") → true
    //startHi("hi") → true
    //startHi("hello hi") → false
    public static void main(String[]agrs){
        startHi start = new startHi();
        System.out.println(start.startHi("hi there"));
        System.out.println(start.startHi("hi"));
        System.out.println(start.startHi("hello hi"));
    }

}
