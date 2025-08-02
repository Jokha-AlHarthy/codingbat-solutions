public class in1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if(!outsideMode){
            return (n >= 1 && n <= 10);
        }else{
            return (n <= 1 || n >= 10);
        }
    }

    //in1To10(5, false) → true
    //in1To10(11, false) → false
    //in1To10(11, true) → true
    public static void main(String[]args){
        in1To10 to = new in1To10();
        System.out.println(to.in1To10(5, false));
        System.out.println(to.in1To10(11, false));
        System.out.println(to.in1To10(11, true));

    }
}
