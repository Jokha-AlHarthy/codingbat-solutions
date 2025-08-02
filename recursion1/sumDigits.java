public class sumDigits {
    public int sumDigits(int n) {
        if(n==0){
            return 0;
        }else{
            return (n %10) + sumDigits(n/10);
        }
    }

    //sumDigits(126) → 9
    //sumDigits(49) → 13
    //sumDigits(12) → 3
    public static void main(String[]args){
        sumDigits addition = new sumDigits();
        System.out.println(addition.sumDigits(126));
        System.out.println(addition.sumDigits(49));
        System.out.println(addition.sumDigits(12));
    }
}
