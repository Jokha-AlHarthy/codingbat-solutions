public class intMax {
    public int intMax(int a, int b, int c) {
        if(a >= b && a>= c){
            return a;
        }else if(b >= a && b>= c){
            return b;
        }else{
            return c;
        }
    }

    //intMax(1, 2, 3) → 3
    //intMax(1, 3, 2) → 3
    //intMax(3, 2, 1) → 3
    public static void main(String[]args){
        intMax max = new intMax();
        System.out.println(max.intMax(1, 2, 3));
        System.out.println(max.intMax(1, 3, 2));
        System.out.println(max.intMax(3, 2, 1));
    }
}
