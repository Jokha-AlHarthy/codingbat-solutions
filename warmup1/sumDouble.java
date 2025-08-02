public class sumDouble {
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if(a == b){
            sum = sum * 2;
        }
        return sum;
    }

    //sumDouble(1, 2) → 3
    //sumDouble(3, 2) → 5
    //sumDouble(2, 2) → 8
    public static void main(String[]args){
        sumDouble num = new sumDouble();
        System.out.println(num.sumDouble(1, 2));
        System.out.println(num.sumDouble(3, 2));
        System.out.println(num.sumDouble(2, 2));
    }

}
