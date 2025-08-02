public class less20 {
    public boolean less20(int n) {
        int mod = n % 20;
        if(mod == 18 || mod == 19){
            return true;
        }else{
            return false;
        }
    }

    //less20(18) → true
    //less20(19) → true
    //less20(20) → false
    public static void main(String[]args){
        less20 less = new less20();
        System.out.println(less.less20(18));
        System.out.println(less.less20(19));
        System.out.println(less.less20(20));
    }
}
