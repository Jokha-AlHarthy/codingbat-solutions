public class or35 {
    public boolean or35(int n) {
        if(n % 3==0 ||n % 5 == 0){
            return true;
        }else{
            return false;
        }
    }

    //or35(3) → true
    //or35(10) → true
    //or35(8) → false
    public static void main(String[]args){
        or35 num = new or35();
        System.out.println(num.or35(3) );
        System.out.println(num.or35(10) );
        System.out.println(num.or35(8) );
    }

}
