public class in3050 {
    public boolean in3050(int a, int b) {
        if(a >= 30 && a <= 40 && b >= 30 && b <= 40){
            return true;
        }else if (a >= 40 && a <= 50 && b >= 40 && b <= 50){
            return true;
        }else{
            return false;
        }
    }

    //in3050(30, 31) → true
    //in3050(30, 41) → false
    //in3050(40, 50) → true
    public static void main(String[]args){
        in3050 num = new in3050();
        System.out.println(num.in3050(30, 31));
        System.out.println(num.in3050(30, 41));
        System.out.println(num.in3050(40, 50));
    }
}
