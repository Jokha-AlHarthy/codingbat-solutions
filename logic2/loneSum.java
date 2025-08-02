public class loneSum {
    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if(a!=b && a!=c){
            sum += a;
        }
        if(b!=a && b!=c){
            sum += b;
        }
        if(c!=a && c!=b){
            sum += c;
        }
        return sum;
    }

    //loneSum(1, 2, 3) → 6
    //loneSum(3, 2, 3) → 2
    //loneSum(3, 3, 3) → 0
    public static void main(String[]aegs){
        loneSum lone = new loneSum();
        System.out.println(lone.loneSum(1, 2, 3));
        System.out.println(lone.loneSum(3, 2, 3));
        System.out.println(lone.loneSum(3, 3, 3));
    }
}
