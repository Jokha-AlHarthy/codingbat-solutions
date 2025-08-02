public class dividesSelf {
    public boolean dividesSelf(int n) {
        int num = n;
        while(n>0){
            int digit = n % 10;
            if(digit == 0 || num % digit != 0){
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    //dividesSelf(128) → true
    //dividesSelf(12) → true
    //dividesSelf(120) → false
    public static void main(String[]args){
        dividesSelf division = new dividesSelf();
        System.out.println(division.dividesSelf(128));
        System.out.println(division.dividesSelf(12));
        System.out.println(division.dividesSelf(120));
    }
}
