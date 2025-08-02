public class factorial {
    public int factorial(int n) {
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    //factorial(1) → 1
    //factorial(2) → 2
    //factorial(3) → 6
    public static void main(String[]args){
        factorial f = new factorial();
        System.out.println(f.factorial(1));
        System.out.println(f.factorial(2));
        System.out.println(f.factorial(3));
    }
}
