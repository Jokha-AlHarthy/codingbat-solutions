public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            if(a < 0 && b < 0){
                return true;
            }else{
                return false;
            }
        }else{
            if((a < 0 && b > 0) || (a>0 && b<0)){
                return true;
            }else{
                return false;
            }
        }
    }

    //posNeg(1, -1, false) → true
    //posNeg(-1, 1, false) → true
    //posNeg(-4, -5, true) → true
    public static void main(String[]args){
        posNeg number = new posNeg();
        System.out.println(number.posNeg(1, -1, false));
        System.out.println(number.posNeg(-1, 1, false));
        System.out.println(number.posNeg(-4, -5, true));

    }
}
