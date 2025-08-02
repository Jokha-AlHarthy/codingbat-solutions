public class more20 {
    public boolean more20(int n) {
        int mod = n % 20;
        if(mod == 1 || mod ==2){
            return true;
        }else{
            return false;
        }
    }

    //more20(20) → false
    //more20(21) → true
    //more20(22) → true
    public static void main(String[]args){
        more20 more = new more20();
        System.out.println(more.more20(20));
        System.out.println(more.more20(21));
        System.out.println(more.more20(22));
    }
}
