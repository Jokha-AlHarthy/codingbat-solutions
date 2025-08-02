public class closeFar {
    public boolean closeFar(int a, int b, int c) {
        boolean closeB = Math.abs(a - b) <= 1;
        boolean closeC = Math.abs(a - c) <= 1;
        boolean farB = Math.abs(b - c) >= 2;
        boolean farC = Math.abs(b - c) >= 2;
        if(closeB && !closeC && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2){
            return true;
        }else if(closeC && !closeB && Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2){
            return true;
        }else{
            return false;
        }
    }

    //closeFar(1, 2, 10) → true
    //closeFar(1, 2, 3) → false
    //closeFar(4, 1, 3) → true
    public static void main(String[]args){
        closeFar CF = new closeFar();
        System.out.println(CF.closeFar(1, 2, 10));
        System.out.println(CF.closeFar(1, 2, 3));
        System.out.println(CF.closeFar(4, 1, 3));
    }
}
