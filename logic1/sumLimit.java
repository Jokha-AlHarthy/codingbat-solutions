public class sumLimit {
    public int sumLimit(int a, int b) {
        int sum = a + b;
        int aDigits = String.valueOf(a).length();
        int sumDigits = String.valueOf(sum).length();
        if(sumDigits > aDigits){
            return a;
        }else{
            return sum;
        }
    }

    //sumLimit(2, 3) → 5
    //sumLimit(8, 3) → 8
    //sumLimit(8, 1) → 9
    public static void main(String[]args){
        sumLimit limit = new sumLimit();
        System.out.println(limit.sumLimit(2, 3));
        System.out.println(limit.sumLimit(8,3));
        System.out.println(limit.sumLimit(8,1));

    }
}
