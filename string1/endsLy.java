public class endsLy {
    public boolean endsLy(String str) {
        if(str.endsWith("ly")){
            return true;
        }else{
            return false;
        }
    }

    //endsLy("oddly") → true
    //endsLy("y") → false
    //endsLy("oddy") → false
    public static void main(String[]args){
        endsLy ends = new endsLy();
        System.out.println(ends.endsLy("oddly"));
        System.out.println(ends.endsLy("y"));
        System.out.println(ends.endsLy("oddy"));
    }
}
