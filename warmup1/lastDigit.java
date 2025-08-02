public class lastDigit {
    public boolean lastDigit(int a, int b) {
        if(a % 10 == b % 10){
            return true;
        }else{
            return false;
        }
    }

    //lastDigit(7, 17) → true
    //lastDigit(6, 17) → false
    //lastDigit(3, 113) → true
    public static void main(String[]args){
        lastDigit num = new lastDigit();
        System.out.println(num.lastDigit(7, 17));
        System.out.println(num.lastDigit(6, 17));
        System.out.println(num.lastDigit(3, 113));
    }

}
