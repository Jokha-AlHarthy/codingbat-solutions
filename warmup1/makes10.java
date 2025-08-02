public class makes10 {
    public boolean makes10(int a, int b) {
        if(a==10){
            return true;
        }else if(b==10){
            return true;
        }else if(a+b == 10){
            return true;
        }else{
            return false;
        }
    }

    //makes10(9, 10) → true
    //makes10(9, 9) → false
    //makes10(1, 9) → true
    public static void main(String[]args){
        makes10 num = new makes10();
        System.out.println(num.makes10(9, 10));
        System.out.println(num.makes10(9, 9));
        System.out.println(num.makes10(1, 9));
    }
}
