public class shareDigit {
    public boolean shareDigit(int a, int b) {
        int aLeft = a / 10;
        int aRight = a % 10;
        int bLeft = b / 10;
        int bRight = b % 10;
        if(aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight){
            return true;
        }else{
            return false;
        }
    }

    //shareDigit(12, 23) → true
    //shareDigit(12, 43) → false
    //shareDigit(12, 44) → false
    public static void main(String[]args){
        shareDigit digit = new shareDigit();
        System.out.println(digit.shareDigit(12, 23));
        System.out.println(digit.shareDigit(12, 43));
        System.out.println(digit.shareDigit(12, 44));
    }
}
