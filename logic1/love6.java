public class love6 {
    public boolean love6(int a, int b) {
        if(a == 6 || b == 6){
            return true;
        }else if(a + b == 6){
            return true;
        }else if(Math.abs(a - b) == 6){
            return true;
        }else{
            return false;
        }
    }

    //love6(6, 4) → true
    //love6(4, 5) → false
    //love6(1, 5) → true
    public static void main(String[]args){
        love6 l = new love6();
        System.out.println(l.love6(6, 4));
        System.out.println(l.love6(4, 5));
        System.out.println(l.love6(1, 5));
    }
}
