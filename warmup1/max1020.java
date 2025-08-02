public class max1020 {
    public int max1020(int a, int b) {
        if(a < 10 || a > 20){
            a = 0;
        }
        if(b < 10 || b > 20){
            b = 0;
        }
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    //max1020(11, 19) → 19
    //max1020(19, 11) → 19
    //max1020(11, 9) → 11
    public static void main(String[]args){

    }

}
