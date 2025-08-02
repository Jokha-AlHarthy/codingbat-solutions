public class lessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        if(Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10){
            return true;
        }else{
            return false;
        }
    }


    //lessBy10(1, 7, 11) → true
    //lessBy10(1, 7, 10) → false
    //lessBy10(11, 1, 7) → true
    public static void main(String[]args){
        lessBy10 less = new lessBy10();
        System.out.println(less.lessBy10(1, 7, 11));
        System.out.println(less.lessBy10(1, 7, 10));
        System.out.println(less.lessBy10(11, 1, 7));
    }
}
