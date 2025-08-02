public class luckySum {
    public int luckySum(int a, int b, int c) {
        if(a==13){
            return 0;
        }else if(b==13){
            return a;
        }else if(c==13){
            return a + b;
        }else{
            return a + b + c;
        }
    }

    //luckySum(1, 2, 3) → 6
    //luckySum(1, 2, 13) → 3
    //luckySum(1, 13, 3) → 1
    public static void main(String[]args){
        luckySum sum = new luckySum();
        System.out.println(sum.luckySum(1, 2, 3));
        System.out.println(sum.luckySum(1, 2, 13));
        System.out.println(sum.luckySum(1,13, 3));
    }
}
