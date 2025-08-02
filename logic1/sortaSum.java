public class sortaSum {
    public int sortaSum(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <= 19){
            return 20;
        }else{
            return sum;
        }
    }

    //sortaSum(3, 4) → 7
    //sortaSum(9, 4) → 20
    //sortaSum(10, 11) → 21
    public static void main(String[]args){
        sortaSum sort = new sortaSum();
        System.out.println(sort.sortaSum(3, 4));
        System.out.println(sort.sortaSum(9, 4));
        System.out.println(sort.sortaSum(10, 11));
    }
}
