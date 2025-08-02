public class roundSum {
    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public int round10(int num){
        int remainder = num % 10;
        if(remainder >= 5){
            return num + (10 - remainder);
        }else{
            return num - remainder;
        }
    }

    //roundSum(16, 17, 18) → 60
    //roundSum(12, 13, 14) → 30
    //roundSum(6, 4, 4) → 10
    public static void main(String[]args){
        roundSum round = new roundSum();
        System.out.println(round.roundSum(16, 17, 18));
        System.out.println(round.roundSum(12, 13, 14));
        System.out.println(round.roundSum(6, 4, 4));
    }
}
