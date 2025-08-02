public class in1020 {
    public boolean in1020(int a, int b) {
        if(a >= 10 && a <= 20){
            return true;
        }else if(b >= 10 && b <= 20){
            return true;
        }else{
            return false;
        }
    }

    //in1020(12, 99) → true
    //in1020(21, 12) → true
    //in1020(8, 99) → false
    public static void main(String[]args){
        in1020 num = new in1020();
        System.out.println(num.in1020(12, 99));
        System.out.println(num.in1020(21, 12));
        System.out.println(num.in1020(8, 99));
    }

}
