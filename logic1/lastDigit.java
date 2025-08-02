public class lastDigit {
    public boolean lastDigit(int a, int b, int c) {
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        if(lastA == lastB || lastA == lastC || lastB == lastC){
            return true;
        }else{
            return false;
        }
    }

    //lastDigit(23, 19, 13) → true
    //lastDigit(23, 19, 12) → false
    //lastDigit(23, 19, 3) → true
    public static void main(String[]args){
        lastDigit digit = new lastDigit();
        System.out.println(digit.lastDigit(23, 19, 13));
        System.out.println(digit.lastDigit(23, 19, 12));
        System.out.println(digit.lastDigit(23, 19, 3));
    }
}
