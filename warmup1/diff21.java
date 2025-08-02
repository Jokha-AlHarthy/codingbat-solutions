public class diff21 {
    public int diff21(int n) {
        if(n<=21){
            return 21 - n;
        }else{
            return (n - 21) * 2;
        }
    }

    //diff21(19) → 2
    //diff21(10) → 11
    //diff21(21) → 0
    public static void main (String []args){
        diff21 difference = new diff21();
        System.out.println(difference.diff21(19));
        System.out.println(difference.diff21(10));
        System.out.println(difference.diff21(21));

    }
}
